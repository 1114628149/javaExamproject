package com.hqyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.SysUserDao;
import com.hqyj.pojo.SysUser;

/**  
* Title: SysUserServiceImpl.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
@Service
public class SysUserServiceImpl implements SysUserService{
	@Autowired
	private SysUserDao dao;
	

	/* (non-Javadoc)
	 * @see com.hqyj.service.SysUserService#findByNameAndPwd(java.lang.String, java.lang.String)
	 */
	@Override
	public SysUser findByNameAndPwd(String username, String password) {
		// TODO Auto-generated method stub
		return dao.findByNameAndPwd(username, password);
		
	}

}
