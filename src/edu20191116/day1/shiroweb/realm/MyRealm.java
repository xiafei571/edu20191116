package edu20191116.day1.shiroweb.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import edu20191116.common.MD5Util;
import edu20191116.day1.service.UserService;
import edu20191116.day1.vo.UserInfo;

public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String loginId = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(userService.getRoles(loginId));
		authorizationInfo.setStringPermissions(userService.getPermissions(loginId));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String loginId = (String) token.getPrincipal();
		UserInfo user = userService.getUserByLoginId(loginId);
//        //盐值方式
//        ByteSource credenttialsSalt = ByteSource.Util.bytes(user.getUserName());
//        AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getLoginId(), user.getPassword(),
//                credenttialsSalt, getName());
		// 封装用户信息，构建AuthenticationInfo对象并返回
		AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getLoginId(), user.getPassword(), getName());
		return authcInfo;
	}

	public static void main(String[] args) {
		// 盐值
		// ByteSource credenttialsSalt = ByteSource.Util.bytes("admin");
		System.out.println(MD5Util.textToMD5U16("admin"));
//		
//		String hashAlgorithName = "MD5";
//        String password = "5678";
//        int hashIterations = 1024;
//        ByteSource credentialsSalt = ByteSource.Util.bytes("cat");
//        Object obj = new SimpleHash(hashAlgorithName, password, credentialsSalt, hashIterations);
//        System.out.println(obj);
	}

}
