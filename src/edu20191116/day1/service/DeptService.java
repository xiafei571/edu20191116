package edu20191116.day1.service;

import java.util.List;

import edu20191116.common.page.PaginationResult;
import edu20191116.day1.vo.DeptInfo;

public interface DeptService {

	List<DeptInfo> getDeptList();
	
	Integer getDeptCount();
	
	DeptInfo getDeptById(Integer deptno);

	Integer addDept(DeptInfo dept);

	Integer updateDept(DeptInfo dept);

	Integer deleteDept(Integer deptno);

	PaginationResult<List<DeptInfo>> getDeptPage(Integer pageIndex, Integer pageSize);
}
