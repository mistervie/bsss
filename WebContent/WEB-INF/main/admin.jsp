<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
   String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>管理</title>
	<link rel="stylesheet" type="text/css" href="css/mainmanipulate.css">
	<script type="text/javascript">
		
		function getNextElement(node){  
    		if(!node.nextSibling) return null;  
    		var nextNode = node.nextSibling;  
    		if(nextNode.nodeType == 1){  
        		return nextNode;  
    		}  
    		return getNextElement(node.nextSibling);  
		}  	

		function getPreviousElement(node){  
    		if(!node.previousSibling) return null;  
    		var previousNode = node.previousSibling;  
    		if(previousNode.nodeType == 1){  
        		return previousNode;  
    		}  
    		return getPreviousElement(node.previousSibling);  
		}  

		function clickShow(it){
			var ul = getNextElement(it);
			var state = "none";
			if (ul.style.display == state) {
				ul.style.display = "";
			}else{
				ul.style.display = state;
			}
		}

		function clickedAction(t,url){
			
			t.style.backgroundColor = "#0071C5";
			t.style.color = "white";
			
			var actionItemlia = document.getElementsByClassName("actionItemli");
			for (var i = 0; i < actionItemlia.length; i++) {
				if(t != actionItemlia[i]){
					actionItemlia[i].style.backgroundColor = "";
					actionItemlia[i].style.color = "#0071C5";
				}
			}
			var right_nav_content = "当前位置:&nbsp"+getPreviousElement(t.parentNode).innerHTML+"&nbsp-&nbsp"+t.innerHTML;
			document.getElementById("right_nav").innerHTML = right_nav_content;
			document.getElementById("right_manipulate_html").src = url;
		}

	</script>
</head>
<body>
<div id="header">
	<div id="head_top_label">企业基本养老保险管理系统</div>
	<div id="header_login_user">欢迎：${msg}&nbsp;&nbsp;|&nbsp;&nbsp;<a href="exit" style="color: white; text-decoration: none">退出登录</a></div>
</div>

<div id="center">
	<div id="center_left">
		<div class="actionItem" onclick="clickShow(this)">在职业务</div>
			<ul class="actionItemUl">
				<li class="actionItemli" onclick="clickedAction(this,'staffallselect')">个人综合信息查询</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">个人缴费管理</li>
				<li class="actionItemli" onclick="clickedAction(this,'basicInfoMaintenance')">个人基本信息维护</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">在职职工亡故待遇计算</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">单位综合查询</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">单位缴费管理</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">单位信息维护</li>
			</ul>
		
		<div class="actionItem" onclick="clickShow(this)">离退休业务</div>
			<ul class="actionItemUl" style="display: none">
				<li class="actionItemli" onclick="clickedAction(this,'')">B1</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">B3</li>
			</ul>
		<div class="actionItem" onclick="clickShow(this)">批量业务</div>
			<ul class="actionItemUl" style="display: none">
				<li class="actionItemli" onclick="clickedAction(this,'')">C1</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C1</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C1</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C1</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C3</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C1</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C2</li>
				<li class="actionItemli" onclick="clickedAction(this,'')">C3</li>
			</ul>
		
		<div class="actionItem" onclick="clickShow(this)">系统管理</div>
			<ul class="actionItemUl" style="display: none">
				<li class="actionItemli" onclick="clickedAction(this,'operatorManagement')">操作员管理</li>
				<li class="actionItemli" onclick="clickedAction(this,'updateLoginPassword')">更改登录密码</li>
			</ul>				
	</div>
  	<div id="center_right">
  		<div id="right_nav">当前位置：Home</div>
  		<div id="right_manipulate">
  			<iframe src="" id="right_manipulate_html" frameborder="0"></iframe>
  		</div>
  	</div>
</div>

<div id="footer">
	<hr>
    <p><font color="#666666" size="2">版权所有 &copy; 2011-2015 人力资源和社会保障局&nbsp;&nbsp;&nbsp;技术支持：信息管理科</font></p>
</div>

</body>
</html>