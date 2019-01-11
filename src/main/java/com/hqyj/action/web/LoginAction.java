package com.hqyj.action.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
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
@Controller(value="webloginaction")
@RequestMapping("/web")
public class LoginAction {

	@RequestMapping("/login")
	public String login(){
		return "web/login";
	}
	@RequestMapping("/exam")
	public String exam(){
		return "web/exam";
	}
	
	@RequestMapping("/dologin")
	@ResponseBody
	public String dologin(String name,
			String password){
		Subject currentUser = SecurityUtils.getSubject();
        //登录逻辑
        if (!currentUser.isAuthenticated()) {
        	//是否被登录过
        	//UsernamePasswordToken用于存放当前的账号和密码
            MyToken token = new MyToken(name,password );
            token.setType(0);//标示为前端登录
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
        return "success";
	}
}
