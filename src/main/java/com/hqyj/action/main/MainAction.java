package com.hqyj.action.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* Title: MainAction.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年1月8日  
* @version 1.0  
*/
@Controller
public class MainAction {
	@RequestMapping("/main")
	public String main(){
		return "main";
	}
}
