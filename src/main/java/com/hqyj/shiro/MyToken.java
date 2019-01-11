package com.hqyj.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**  
* Title: MyToken.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
public class MyToken extends UsernamePasswordToken {
	private int type=1;//0代表前端用户，1代表后端用户

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * 
	 */
	public MyToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param rememberMe
	 * @param host
	 */
	public MyToken(String username, char[] password, boolean rememberMe, String host) {
		super(username, password, rememberMe, host);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param rememberMe
	 */
	public MyToken(String username, char[] password, boolean rememberMe) {
		super(username, password, rememberMe);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param host
	 */
	public MyToken(String username, char[] password, String host) {
		super(username, password, host);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 */
	public MyToken(String username, char[] password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param rememberMe
	 * @param host
	 */
	public MyToken(String username, String password, boolean rememberMe, String host) {
		super(username, password, rememberMe, host);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param rememberMe
	 */
	public MyToken(String username, String password, boolean rememberMe) {
		super(username, password, rememberMe);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param host
	 */
	public MyToken(String username, String password, String host) {
		super(username, password, host);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 */
	public MyToken(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
	
	
}
