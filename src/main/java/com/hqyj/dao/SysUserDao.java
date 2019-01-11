package com.hqyj.dao;

import org.apache.ibatis.annotations.Param;

import com.hqyj.pojo.SysUser;

/**  
* Title: SysUserDao.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
public interface SysUserDao {

	public SysUser findByNameAndPwd(@Param("name")String name,
			@Param("password")String password);
}
