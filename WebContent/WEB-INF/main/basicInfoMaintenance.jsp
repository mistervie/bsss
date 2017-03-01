<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
   String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>管理</title>
	<link rel="stylesheet" type="text/css" href="css/basicInfoMaintenance.css">
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
</head>
<body>
<div id="center">
	<div id="tip">请先输入[个人编号]
		<input type="text" onmouseover="selectInputContent(this)" class="userID" id="sidinput">
		<input type="button" class="selectButton" onclick="getStaffBasicInfo()" value="查询">
	</div>
	<form action="" id="staffBasicInfoForm" method="post">
		<table id="userinfo" cellspacing="0" cellpadding="0">
		<tr>
			<td>个人编号：</td><td><input type="text" name="sid" readonly="true" id="sid" class="getData"></td>
			<td>公民身份证号码：</td><td><input type="text" name="sino" id="sino" class="getData"></td>
		</tr>
		<tr>
			<td>姓名：</td><td><input type="text" name="sname" id="sname" class="getData"></td>
			<td>性别：</td>
			<td>
				<select name="ssex" id="ssex" class="getData">
					<option value="1">男</option>	
					<option value="0">女</option>					
				</select>
			</td>
		</tr>
		<tr>
			<td>民族：</td>
			<td>
				<select name="snation" id="snation" class="getData">
					<option value="1">汉族</option>	
					<option value="2">回族</option>					
				</select>
			</td>
			<td>出生日期：</td><td><input type="text" name="sbirth" id="sbirth" class="getData"></td>
		</tr> 
		<tr>
			<td>参加工作日期：</td><td><input type="text" name="sdaj" id="sdaj" class="getData"></td>
			<td>个人身份：</td>
			<td>
				<select name="spi" id="spi" class="getData">
					<option value="1">在职</option>	
					<option value="2">退休</option>					
				</select>
			</td>
		</tr>
		<tr>
			<td>学历：</td>
			<td>
				<select name="seb" id="seb" class="getData">
					<option value="1">博士</option>	
					<option value="2">硕士</option>
					<option value="3">学士</option>	
					<option value="4">其他</option>								
				</select>
			</td>
			<td>人员状态：</td>
			<td>
				<select name="sstate" id="sstate" class="getData">
					<option value="1">在保</option>	
					<option value="2">暂停</option>
					<option value="3">死亡</option>								
				</select>
			</td>
		</tr>
	
		<tr>
			<td>单位编号：</td><td><input type="text" name="cid" id="cid" class="getData" onchange="getCompanyCsnCname(this)"></td>
			<td>单位简称：</td><td><input type="text" name="csn" id="csn" readonly="true" class="getData"></td>
		</tr>
		<tr>
			<td>单位名称：</td><td colspan="3"><input type="text" name="cname" id="cname" readonly="true" class="getData"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" name="submit" onclick="return updateStaffBasicInfo()" value="更&nbsp;&nbsp;&nbsp;&nbsp;新" id="submit"></td>
			<td colspan="2"><input type="reset" name="reset" value="重&nbsp;&nbsp;&nbsp;&nbsp;置" id="reset"></td>
		</tr>
	</table>
	</form>
	<div id="tip_1"><img src="image/userinfoupdate/help1.gif" alt=""></img>注意：以上信息为在职职工基本信息，如若修改，请核查办理人详细资料以免造成信息错误。</div>
</div>
</body>

<script type="text/javascript">
		function selectInputContent(obj){
			obj.focus();
			obj.select();
		}
		
		function getStaffBasicInfo(){
			var sidinput = $.trim(document.getElementById("sidinput").value);
			if(sidinput != ""){
				$.ajax({
					type:"POST",
					url:"getStaffBasicInfo/"+sidinput,
					async:false,
					dataType:"json",
					success:function(msg){
						var exp = null;
						if(msg.sid != exp){
							document.getElementById("sid").value = msg.sid;
							document.getElementById("sino").value = msg.sino;
							document.getElementById("sname").value = msg.sname;
							document.getElementById("ssex").value = msg.ssex;
							document.getElementById("snation").value = msg.snation;
							document.getElementById("sbirth").value = msg.sbirth;
							document.getElementById("sdaj").value = msg.sdaj;
							document.getElementById("spi").value = msg.spi;
							document.getElementById("seb").value = msg.seb;
							document.getElementById("sstate").value = msg.sstate;
							document.getElementById("cid").value = msg.cid;
							document.getElementById("csn").value = msg.csn;
							document.getElementById("cname").value = msg.cname;
						}else{
							alert("查无此人!");
						}
					},
					error:function(XMLHttpRequest, textStatus, errorThrown){
						 alert("系统错误!请联系管理员。错误代码:"+XMLHttpRequest.status+"-"+XMLHttpRequest.readyState+"-"+textStatus);
					},
					complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数  
						　　　if(status=='timeout'){//超时,status还有success,error等值的情况  
						　　　　　 ajaxTimeoutTest.abort();  
						　　　　  alert("超时");  
						　　　}  
					}  
				});
			}else{
				alert("请输入个人编号!");
			}
		}
		
		
		function updateStaffBasicInfo(){
			var getData = document.getElementsByClassName("getData");
			var flag=true;
			for(var i=0;i<getData.length;i++){
				var input = $.trim(getData[i].value);
				if(input == ""){
					flag=false;
				}
			}
			if(flag){
				$.ajax({
					type:"POST",
					url:"updateStaffBasicInfo",
					async:false,
					timeout: 3600,
					dataType:"text",
					data:$("#staffBasicInfoForm").serializeArray(),
					contentType:"application/x-www-form-urlencoded;charset=UTF-8",
					success:function(msg){
						var res = eval("("+msg+")");
						if(res.result == "ok"){
							alert("更新成功!");
						}else{
							alert("更新失败!");
						}
					},
					error:function(XMLHttpRequest, textStatus, errorThrown){
						 alert("系统错误!请联系管理员。错误代码:"+XMLHttpRequest.status+"-"+XMLHttpRequest.readyState+"-"+textStatus);
					},
					complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数  
						　　　if(status=='timeout'){//超时,status还有success,error等值的情况  
						　　　　　 ajaxTimeoutTest.abort();  
						　　　　  alert("超时");  
						　　　}  
					}  
				});
			}else{
				alert("提交数据中有空值，请检查!");
				return false;
			}
		}
		
		function getCompanyCsnCname(cid){
			var cid = $.trim(document.getElementById("cid").value);
			if(cid != ""){
				$.ajax({
					type:"POST",
					url:"getCompanyCsnCname/"+cid,
					async:false,
					dataType:"json",
					success:function(msg){
						var exp = null;
						if(msg.cid != exp){
							document.getElementById("csn").value = msg.csn;
							document.getElementById("cname").value = msg.cname;
						}else{
							alert("此单位不存在!");
						}
					},
					error:function(XMLHttpRequest, textStatus, errorThrown){
						 alert("系统错误!请联系管理员。错误代码:"+XMLHttpRequest.status+"-"+XMLHttpRequest.readyState+"-"+textStatus);
					},
					complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数  
						　　　if(status=='timeout'){//超时,status还有success,error等值的情况  
						　　　　　 ajaxTimeoutTest.abort();  
						　　　　  alert("超时");  
						　　　}  
					}  
				});
			}else{
				alert("请输入单位编号编号!");
			}
		}
		
	</script>
</html>