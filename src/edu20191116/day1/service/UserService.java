package edu20191116.day1.service;

import java.util.Set;

import edu20191116.day1.vo.UserInfo;

public interface UserService {
	/**
	 * 根据登录名查询用户信息
	 * @param loginId
	 * @return
	 */
	UserInfo getUserByLoginId(String loginId);

	/**
	 * 根据登录名查询角色
	 * 
	 * @param loginId
	 * @return
	 */
	public Set<String> getRoles(String loginId);

	/**
	 * 根据登录名查询权限
	 * 
	 * @param loginId
	 * @return
	 */
	public Set<String> getPermissions(String loginId);
}
