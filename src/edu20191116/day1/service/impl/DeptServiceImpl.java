package edu20191116.day1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu20191116.common.page.Pagination;
import edu20191116.common.page.PaginationResult;
import edu20191116.day1.dao.DeptDAO;
import edu20191116.day1.service.DeptService;
import edu20191116.day1.vo.DeptInfo;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDAO deptDAO;

	@Override
	public List<DeptInfo> getDeptList() {
		return deptDAO.getDetpList();
	}

	@Override
	public Integer getDeptCount() {
		return deptDAO.getDeptCount();
	}

	@Override
	public DeptInfo getDeptById(Integer deptno) {
		return deptDAO.getDeptById(deptno);
	}

	@Override
	public Integer addDept(DeptInfo dept) {
		return deptDAO.addDept(dept);
	}

	@Override
	public Integer updateDept(DeptInfo dept) {
		return deptDAO.updateDept(dept);
	}

	@Override
	public Integer deleteDept(Integer deptno) {
		return deptDAO.deleteDept(deptno);
	}

	@Override
	public PaginationResult<List<DeptInfo>> getDeptPage(Integer pageIndex, Integer pageSize) {
		Pagination pagination = new Pagination(pageIndex, pageSize);
		//总数
		Integer totalCount = deptDAO.getDeptCount();
		pagination.setTotalCount(totalCount);
		
		List<DeptInfo> list = deptDAO.getDetpList(pagination.getCursor(), pagination.getOffset());
		pagination.setCurrentPageCount(list.size());
		
		PaginationResult<List<DeptInfo>> result = new PaginationResult<List<DeptInfo>>(pagination, list);
		return result;
	}

}
