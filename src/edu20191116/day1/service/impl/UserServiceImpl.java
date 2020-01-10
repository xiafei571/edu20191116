package edu20191116.day1.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu20191116.day1.dao.mapper.UserMapper;
import edu20191116.day1.service.UserService;
import edu20191116.day1.vo.UserInfo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Set<String> getRoles(String loginId) {
		return userMapper.getRoles(loginId);
	}

	@Override
	public Set<String> getPermissions(String loginId) {
		return userMapper.getPermissions(loginId);
	}

	@Override
	public UserInfo getUserByLoginId(String loginId) {
		return userMapper.getUserByLoginId(loginId);
	}

}
