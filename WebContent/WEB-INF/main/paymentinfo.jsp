<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
   String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/paymentinfo.css">
	<script type="text/javascript">
		
	</script>
</head>
<body>
<div class="tip">个人基本信息</div>
<table class="table" id="spinfo" cellspacing="0" cellpadding="0">
	<tr>
					<th>个人编号</th>
					<th>身份证号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>民族</th>
					<th>出生年月</th>
					<th>参加工作时间</th>
					<th>单位编号</th>
					<th>单位简称</th>
					<th>人员状态</th>
				</tr>
				<tr>
					<td>410185190000000000</td>
					<td>410185190000000000</td>
					<td>李小五</td>
					<td>男</td>
					<td>汉</td>
					<td>1900-00-00</td>
					<td>1900-00</td>
					<td>4101850000000</td>
					<td>河南省河南省河南省河南省</td>
					<td>在职</td>
				</tr>
</table>
<div class="tip">个人缴费明细</div>
<table class="table" id="paymentinfo" cellspacing="0" cellpadding="0">
					<tr>
						<th>年\月</th>
						<th>1月</th>
						<th>2月</th>
						<th>3月</th>
						<th>4月</th>
						<th>5月</th>
						<th>6月</th>
						<th>7月</th>
						<th>8月</th>
						<th>9月</th>
						<th>10月</th>
						<th>11月</th>
						<th>12月</th>
					<tr>
					<tr>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
					</tr>
					<tr>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
						<td>2000</td>
					</tr>
	</table>
</body>
</html>