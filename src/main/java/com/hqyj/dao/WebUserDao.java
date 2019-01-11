package com.hqyj.dao;

import org.apache.ibatis.annotations.Param;

import com.hqyj.pojo.WebUser;

/**  
* Title: WebUserDao.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
public interface WebUserDao {
	public WebUser findByNameAndPwd(@Param("username")String username,
			@Param("pwd")String pwd);
}
