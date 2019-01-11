<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>登录</title>  
    <link rel="stylesheet" href="style/css/pintuer.css">
    <link rel="stylesheet" href="style/css/admin.css">
    <script src="style/js/jquery.js"></script>
    <script src="style/js/pintuer.js"></script>  
</head>
<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height:150px;"></div>
            <div class="media media-y margin-big-bottom">           
            </div>         
            <form action="index.html" method="post">
            <div class="panel loginbox">
                <div class="text-center margin-big padding-big-top"><h1>后台管理中心</h1></div>
                <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input id ="name" type="text" class="input input-big" name="name" placeholder="登录账号" data-validate="required:请填写账号" />
                            <span class="icon icon-user margin-small"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input id="password" type="password" class="input input-big" name="password" placeholder="登录密码" data-validate="required:请填写密码" />
                            <span class="icon icon-key margin-small"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="field">
                            <input id="code" type="text" class="input input-big" name="code" placeholder="填写右侧的验证码" data-validate="required:请填写右侧的验证码" />
                           <img id="piccode" src="code" alt="" width="100" height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="this.src=this.src+'?'">  
                                                   
                        </div>
                    </div>
                </div>
                <div style="padding:30px;"><input type="button" class="button button-block bg-main text-big input-big" value="登录"
                onclick="login()"></div>
            </div>
            </form>          
        </div>
    </div>
</div>

</body>
</html>
<script type="text/javascript">
function login(){
	var code=$("#code").val();
	var name=$("#name").val();
	var password=$("#password").val();
	$.ajax({
		url:"login",
		type:"POST",
		data:{"code":code,"name":name,"password":password},
		success:function(message){
			if(message=="success"){//登录成功
				window.location.href="main";
			}else if(message=="error"){//验证码错误
				alert("验证码错误，请重新输入");
			var url=$("#piccode").attr("src");//获取图片地址
			$("#piccode").attr("src",url+"?");	//修改图片地址
				
			}else{//登录失败
				alert("对不起，用户名或密码输入错误，请仔细检查重新登录");
				var url=$("#piccode").attr("src");//获取图片地址
				$("#piccode").attr("src",url+"?");	//修改图片地址
			}
		},
		error:function(){
			alert("对不起，服务器异常");
		}
	}
			
	);
}
</script>
