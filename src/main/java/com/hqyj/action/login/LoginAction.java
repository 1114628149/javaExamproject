package com.hqyj.action.login;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.shiro.MyToken;

/**  
* Title: LoginAction.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
@Controller
public class LoginAction {

	@RequestMapping("/login")
	@ResponseBody
	public String dologin(String code,
			String name,
			String password,HttpSession session){
		//1、获取验证码，校验，如果成功，执行登录，如果失败，返回
		String servercode=(String)session.getAttribute("piccode");
		if(servercode.equalsIgnoreCase(code)){//验证码正确
			Subject currentUser = SecurityUtils.getSubject();
	        //登录逻辑
	        if (!currentUser.isAuthenticated()) {
	        	//是否被登录过
	        	//UsernamePasswordToken用于存放当前的账号和密码
	            MyToken token = new MyToken(name,password );
	            token.setRememberMe(true);
	            try {
	            	//执行登录逻辑
	                currentUser.login(token);
	            } 
	            // ... catch more exceptions here (maybe custom ones specific to your application?
	            catch (AuthenticationException ae) {
	                //unexpected condition?  error?
	            	return "fail";
	            }
	        }
			//登录
			return "success";
		}else{
			return "error";
		}
		
	}
}
