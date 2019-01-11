package com.hqyj.service;

import com.hqyj.pojo.WebUser;

/**  
* Title: WebUserService.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
public interface WebUserService {
	public WebUser findByNameAndPwd(String username,
			String password);
}
