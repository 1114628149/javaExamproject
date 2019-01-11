<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/webstyle/css/index.css"/>
		<script type="text/javascript" src="<%=request.getContextPath() %>/webstyle/js/jquery-1.11.3.min.js"></script>
		<title>在线考试系统</title>
	</head>
	<body>
		<div class="bg">
			<div class="wel">在线考试系统</div>
	        <div class="user">
	       	    <div id="yonghu" style="">用户名</div>
	       	    <input  type="text" name="用户"  value="admin"  id="name"/>
	        </div>
	        <div class="password" >
	        	<div id="yonghu" >密&nbsp;&nbsp;&nbsp;码</div>
	       	    <input class="" type="password" name="密码" value="......"  id="password"/>
	        </div>
	        <div class="rem" >
	       	  <input type="checkbox" name="" id="" value="" />
	        	 <div id="reb">
	        	 	记住密码
	        	 </div>
	        </div>
	        <div class="fg" >
	       	    <div style="font-size: 11px;margin-top: 11px;">
	       	    	<a style="font-size: 11px;" href="#">忘记密码？</a>
	       	    </div>
	        </div>
	        
	        <input class="btn" type="button" name="登录" value="登录" onclick="login()"/>
		</div>
	</body>
</html>
<script type="text/javascript">
function login(){
	var name=$("#name").val();
	var password=$("#password").val();
	$.ajax({
		url:"dologin",
		data:{"name":name,"password":password},
		success:function(massage){
			if(massage=="fail"){
				alert("登录失败，请重新输入您的账号和密码");
			}else{
				window.location.href="exam";
			}
		}
	});
	
}
</script>
    