package com.hqyj.service;

import com.hqyj.pojo.SysUser;

/**  
* Title: SysUserService.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
public interface SysUserService {

	public SysUser findByNameAndPwd(String username,
			String password);
}
