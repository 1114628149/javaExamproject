package com.hqyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.WebUserDao;
import com.hqyj.pojo.WebUser;

/**  
* Title: WebUserServiceImpl.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
@Service
public class WebUserServiceImpl implements WebUserService{
	@Autowired
	private WebUserDao dao;

	/* (non-Javadoc)
	 * @see com.hqyj.service.WebUserService#findByNameAndPwd(java.lang.String, java.lang.String)
	 */
	@Override
	public WebUser findByNameAndPwd(String username, String password) {
		// TODO Auto-generated method stub
		return dao.findByNameAndPwd(username, password);
	}

}
