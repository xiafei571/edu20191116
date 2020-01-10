package edu20191116.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu20191116.common.page.PaginationResult;
import edu20191116.day1.service.DeptService;
import edu20191116.day1.vo.DeptInfo;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getDeptList(ModelMap modelMap) {
		// 查询部门总数
		Integer cnt = deptService.getDeptCount();
		List<DeptInfo> list = deptService.getDeptList();

		modelMap.addAttribute("cnt", cnt);
		modelMap.addAttribute("list", list);
		return "dept";// dept.jsp
	}

	@RequestMapping(value = "/{deptno}", method = RequestMethod.GET)
	@ResponseBody
	public DeptInfo getDept(@PathVariable Integer deptno) {
		return deptService.getDeptById(deptno);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addDept(ModelMap modelMap) {
		modelMap.put("dept", new DeptInfo());
		return "add_dept";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addDeptPost(DeptInfo dept, ModelMap modelMap) {
		deptService.addDept(dept);
		return "redirect:/dept/list";
	}

	@RequestMapping(value = "/{deptno}/update", method = RequestMethod.GET)
	public String updateDept(ModelMap modelMap, @PathVariable Integer deptno) {
		DeptInfo dept = deptService.getDeptById(deptno);
		modelMap.put("dept", dept);
		return "update_dept";
	}

	@RequestMapping(value = "/{deptno}/update", method = RequestMethod.POST)
	public String updateDeptPost(DeptInfo dept, ModelMap modelMap, @PathVariable Integer deptno) {
		deptService.updateDept(dept);
		return "redirect:/dept/list";
	}

	@RequestMapping(value = "/{deptno}/delete", method = RequestMethod.GET)
	public String deleteDept(@PathVariable Integer deptno) {
		deptService.deleteDept(deptno);
		return "redirect:/dept/list";
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	@ResponseBody
	public PaginationResult<List<DeptInfo>> getDeptPage(Integer pageIndex, Integer pageSize) {
		return deptService.getDeptPage(pageIndex, pageSize);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getDeptIndex(ModelMap modelMap, Integer pageIndex, Integer pageSize) {
		modelMap.put("pageIndex", pageIndex);
		modelMap.put("pageSize", pageSize);
		return "dept_index";
	}
}
