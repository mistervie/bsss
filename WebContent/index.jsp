<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
   String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>System Login</title>
	<link href="css/logincss.css" rel="stylesheet" type="text/css">
	<script type="text/javascript">
		
		function validate_required(){
			var cno = document.getElementById("input_usercno").value;
			var password = document.getElementById("input_password").value;
			var captcha = document.getElementById("input_captcha").value;
				if(cno==null || cno=="" || cno=="您的账号"){
					alert("请输入账号!");
					return false
				}else if(password==null || password=="" ){
					alert("请输入密码!");
					return false
				}else if(captcha==null || captcha=="" || captcha=="验证码"){
					alert("验证码错误!");
					return false
				}else{
					return true
				}
			
		}

		function selectInputContent(n){
			obj = document.getElementById(n);
			obj.focus();
			obj.select();
		}
		
	</script>
</head>
<body>
<div class="main_login">
	<div class="login_info_div">
		<div class="logo_div"><img src="image/logo.png" width="613" height="97"></div>
		<div class="login_introduction">
			1. 请设置本页为主页，方便登录系统。<br>
			2. 系统用户应妥善保管用户密码，首次登陆请更改密码并添加密码找回问题。<br>
			3. 系统密码如有丢失可自行找回或携带工作证前往数据信息中心办理重置手续。<br>
		</div>
	</div>
	<div class="login_view">
	<form action="login" onsubmit="return validate_required()" method="post">
		
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="45">
				<input type="text" name="uid" id="input_usercno" value="您的账号" onmouseover="selectInputContent(this.id)" onfocus="if(value=='您的账号'){value=''}" onblur="if(value==''){value='您的账号'}" style="width:174px" />
			</td>
		</tr>
		<tr>
			<td height="45">
				<input type="password" name="upassword" id="input_password" onmouseover="selectInputContent(this.id)" value="pwd" onfocus="if(value=='pwd'){value=''}" onblur="if(value==''){value='pwd'}" style="width:174px" />
			</td>
		</tr>
		<tr>
			<td height="45">
				<input name="captcha" id="input_captcha" onmouseover="selectInputContent(this.id)" value="验证码" onfocus="if(value=='验证码'){value=''}" onblur="if(value==''){value='验证码'}" style="width:104px" />
				<img alt="" src="image/initDigitPicture.jpeg" width="60" height="24">
			</td>
		</tr>
		<tr>
			<td height="25" align="center" class="forget_password"><div id="msg" style="color:red">${msg }&nbsp;&nbsp;</div><a href="">忘记登录密码</a></td>
		</tr>
		
		
		
		<tr>
			<td height="60"><input type="submit" class="login_button" id="login_button" value="登 录" style="border: none;"></td>
		</tr>
	</table>
	</form>
</div>
</div>
<div class="foot">
	<ul>
		
		<li id="gray">版权所有 &copy; 2011-2015 人力资源和社会保障局&nbsp;&nbsp;&nbsp;技术支持：数据信息中心</li>
	</ul>
</div>
</body>
</html>