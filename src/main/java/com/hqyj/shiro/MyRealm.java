package com.hqyj.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.hqyj.service.SysUserService;
import com.hqyj.service.WebUserService;

/**
 * Title: MyRealm.java Description: Copyright: Copyright (c) 2018
 * 
 * @author zhh
 * @date 2019年1月7日
 * @version 1.0
 */
public class MyRealm extends AuthorizingRealm {
	@Autowired
	private SysUserService service;
	
	@Autowired
	private WebUserService webuserserivce;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
	 * .shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.
	 * apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		MyToken t = (MyToken) token;
		String username = t.getUsername();
		String password = new String(t.getPassword());
		// 加密后的密文
		String p = new SimpleHash("Md5", password, username, 1024).toString();
		AuthenticationInfo info = null;
		if (t.getType() == 1) {
			if (service.findByNameAndPwd(username, p) != null) {// 登录成功

				info = new SimpleAuthenticationInfo(username, password, getName());
			} else {
				throw new AuthenticationException();
			}
		} else {// 走前端查询
			if (webuserserivce.findByNameAndPwd(username, p) != null) {// 登录成功

				info = new SimpleAuthenticationInfo(username, password, getName());
			} else {
				throw new AuthenticationException();
			}
		}

		return info;
	}

	public static void main(String[] args) {
		System.out.println(new SimpleHash("Md5", "123", "z", 1024).toString());
	}
}
