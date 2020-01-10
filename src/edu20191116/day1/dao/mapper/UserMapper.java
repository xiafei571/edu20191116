package edu20191116.day1.dao.mapper;

import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu20191116.day1.vo.UserInfo;

public interface UserMapper {

	@Select("select * from sys_users where loginId=#{id} and valid = 1")
	@ResultMap("userResultMap")
	UserInfo getUserByLoginId(@Param("id") String id);
	
	Set<String> getRoles(@Param("loginId")String loginId);

	Set<String> getPermissions(@Param("loginId")String loginId);
}
