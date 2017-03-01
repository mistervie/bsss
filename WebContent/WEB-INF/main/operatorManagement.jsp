<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
   String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>OperatorManagement</title>
	<link rel="stylesheet" type="text/css" href="css/operatorManagement.css">
</head>
<body>
<div id="queryCondition">
	<div class="tableText">查询条件</div>
	<form>
		<table id="queryTable">
			<tr>
				<td>操作员编号:</td>
				<td><input type="text" name="usercno"></td>
				<td>操作员姓名:</td>
				<td><input type="text" name="username"></td>
				<td>
					<input type="submit" name="querySubmit" id="querySubmit" value="查&nbsp;&nbsp;&nbsp;&nbsp;询">
					<input type="reset" name="queryReset" id="queryReset" value="重&nbsp;&nbsp;&nbsp;&nbsp;置">
				</td>
			</tr>
		</table>
	</form>
</div>

<div id="userList">
	<div class="tableText">操作员列表</div>
	<form>
		<table id="userListTable" cellspacing="0" cellpadding="0">
			<tr>
				<th>序号</th>
				<th>编号</th>
				<th>姓名</th>
				<th>所属科室</th>
				<th>注册时间</th>
				<th>最后登录时间</th>
				<th>操作</th>
			</tr>
			<tr>
				<td>1</td>
				<td>410185001</td>
				<td>admin</td>
				<td>数据信息中心</td>
				<td>2012-01-01</td>
				<td>2015-03-02</td>
				<td>
					<input type="button" name="permissionManagement" id="permissionManagement" value="更新">
					<input type="button" name="deleteUser" id="deleteUser" value="删除">
				</td>
			</tr>
			<tr>
				<td>2</td>
				<td>410185002</td>
				<td>测试</td>
				<td>数据信息中心</td>
				<td>2012-01-01</td>
				<td>2015-03-02</td>
				<td>
					<input type="button" name="permissionManagement" id="permissionManagement" value="权限">
					<input type="button" name="deleteUser" id="deleteUser" value="删除">
				</td>
			</tr>
			<tr>
				<td>3</td>
				<td>41085003</td>
				<td>admin</td>
				<td>征缴科</td>
				<td>2016-01-01</td>
				<td>2016-01-01</td>
				<td>
					<input type="button" name="permissionManagement" id="permissionManagement" value="权限">
					<input type="button" name="deleteUser" id="deleteUser" value="删除">
				</td>
			</tr>
			<tr>
				<td>4</td>
				<td>410185004</td>
				<td>admin</td>
				<td>征缴科</td>
				<td>2016-01-01</td>
				<td>2016-01-01</td>
				<td>
					<input type="button" name="permissionManagement" id="permissionManagement" value="权限">
					<input type="button" name="deleteUser" id="deleteUser" value="删除">
				</td>
			</tr>
			<tr>
				<td>5</td>
				<td>410185005</td>
				<td>admin</td>
				<td>征缴科</td>
				<td>2016-01-01</td>
				<td>2016-01-01</td>
				<td>
					<input type="button" name="permissionManagement" id="permissionManagement" value="权限">
					<input type="button" name="deleteUser" id="deleteUser" value="删除">
				</td>
			</tr>
		</table>
	</form>
	<div id="pageControl">
		<div id="pageControlText" style="">当前显示1到5条，共49条记录</div>
		<ul>
			<li>首页</li>
			<li>上一页</li>
			<li>1</li>
			<li>下一页</li>
			<li>尾页</li>
		</ul>
	</div>
</div>
</body>
</html>