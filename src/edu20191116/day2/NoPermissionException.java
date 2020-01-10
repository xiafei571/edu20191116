package edu20191116.day2;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import edu20191116.day1.vo.LoginInfo;

@ControllerAdvice
public class NoPermissionException {
	@ExceptionHandler(org.apache.shiro.authz.UnauthorizedException.class)
	public String handleShiroException(Exception ex) {
//		ModelMap modelMap = new ModelMap();
//		modelMap.put("user", new LoginInfo());
//		modelMap.put("msg", "无权限");
		return "redirect:/login";
	}

	@ExceptionHandler(org.apache.shiro.authz.AuthorizationException.class)
	public String AuthorizationException(Exception ex) {
//		ModelMap modelMap = new ModelMap();
//		modelMap.put("user", new LoginInfo());
//		modelMap.put("msg", "权限认证失败");
		return "redirect:/login";
	}
}
