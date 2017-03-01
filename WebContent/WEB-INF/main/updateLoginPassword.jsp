<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/updateloginpassword.css">
</head>
<body>
<div id="updatePassword">
	<form>
		<table cellspacing="0" cellpadding="0">
		<tr>
			<td>原登录密码：</td><td><input type="text" name="originalPassword" id="originalPassword"></td>
		</tr>
		<tr>
			<td>新登录密码：</td><td><input type="text" name="newPassword" id="newPassword"></td>
		</tr>
		<tr>
			<td>确认新密码：</td><td><input type="text" name="confirmNewPassword" id="confirmNewPassword"></td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" id="submit"></td>
			<td><input type="reset" name="reset" id="reset"></td>
		</tr>
	</table>
	</form>
</div>
</body>
</html>