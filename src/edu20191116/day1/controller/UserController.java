package edu20191116.day1.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu20191116.common.MD5Util;
import edu20191116.day1.vo.LoginInfo;

@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap modelMap) {
		modelMap.put("user", new LoginInfo());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginInfo user, HttpSession session, ModelMap modelMap) {
		// 获取当前登录用户
		Subject subject = SecurityUtils.getSubject();
		// 封装表单中提交的用户名和密码
		UsernamePasswordToken token = new UsernamePasswordToken(user.getLoginId(),
				MD5Util.textToMD5U16(user.getPassword()), user.isRemember());
		try {
			// 调用login方法，传入封装好的token
			subject.login(token);
			// 登录成功跳转
			return "redirect:index";
		} catch (Exception e) {
			e.printStackTrace();
			// 登录失败就重新登录
			modelMap.put("msg", "账号或密码错误");
			user.setPassword(null);
			modelMap.put("user", user);
			return "login";
		}
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		// 获取当前登录用户
		Subject subject = SecurityUtils.getSubject();
		String msg = "未登录";
		if (null != subject.getPrincipal())
			msg = "欢迎：" + subject.getPrincipal();
		modelMap.put("msg", msg);
		return "index";
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		// 重定向到登录页面的跳转方法
		return "redirect:login";
	}
}
