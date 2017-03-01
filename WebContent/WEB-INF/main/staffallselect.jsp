<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<title>综合业务查询</title>
<link rel="stylesheet" type="text/css" href="css/staffallselect.css">
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/staffallselect_tab1.js"></script>
</head>
<body>
	<div>
		<ul id="tab">
			<li class="tabli" style="background-color: #C9E5FD;"
				onclick="tabclick(this)">基本信息</li>
			<li class="tabli" onclick="tabclick(this)">养老保险缴费信息</li>
			<li class="tabli" onclick="tabclick(this)">业务变更记录</li>
		</ul>
		<div id="tabdivs">
			<div class="tabDiv" id="tab1" style="display: inline;">
				<div class="tab_tip">
					请输入[身份证号或姓名] <input type="text" name="getText"
						onmouseover="selectInputContent(this)" class="tab_getText"
						id="tab1_getText"> <input type="button"
						class="tab_selectButton" id="tab1_selectButton" value="查询">
				</div>
				<table class="table" id="table1" cellspacing="0" cellpadding="0">
					<tr>
						<th>序号</th>
						<th>个人编号</th>
						<th>身份证号</th>
						<th>姓名</th>
						<th>性别</th>
						<th>民族</th>
						<th>出生年月</th>
						<th>参加工作时间</th>
						<th>缴费基数</th>
						<th>单位编号</th>
						<th>单位简称</th>
						<th>人员状态</th>
					</tr>

				</table>
				<div class="tab_pageControl" id="tab1_pageControl">
					<div class="tab_pageControlText" id="tab1_pageControlText" style=""></div>
					<ul>
						<li id="selectStaffAllInfoFirstPage" onclick="selectStaffAllInfoFirstPage()">首页</li>
						<li id="selectStaffAllInfoPreviousPage" onclick="selectStaffAllInfoPreviousPage()">上一页</li>
						<li id="currentPageIndex">1</li>
						<li id="selectStaffAllInfoNextPage" onclick="selectStaffAllInfoNextPage()">下一页</li>
						<li id="selectStaffAllInfoLastPage" onclick="selectStaffAllInfoLastPage()">尾页</li>
					</ul>
				</div>
			</div>


			<div class="tabDiv" id="tab2" style="display: none;">
				<div class="tab_tip">
					请输入[个人编号] <input type="text" onmouseover="selectInputContent(this)"
						class="tab_getText" id="tab2_getText"> <input
						type="button" class="tab_selectButton" id="tab2_selectButton"
						onclick="selectAction(this.id)" value="查询">
				</div>
				<div class="webdiv" id="webdiv">
					<iframe src="" class="webjsp" id="webjsp_2" frameborder="0"></iframe>
				</div>
			</div>



			<div class="tabDiv" id="tab3" style="display: none;">
				<div class="tab_tip">
					请输入[个人编号] <input type="text" onmouseover="selectInputContent(this)"
						class="tab_getText" id="tab3_getText"> <input
						type="button" class="tab_selectButton" id="tab3_selectButton"
						onclick="selectAction(this.id)" value="查询">
				</div>

				<table class="table_head" id="table_head" cellspacing="0"
					cellpadding="0">
					<tr>
						<th>序号</th>
						<th>变更时间</th>
						<th>业务名称</th>
						<th class="bbstate">变更前状态</th>
						<th class="baresult">变更结果</th>
						<th>操作员</th>
					</tr>
				</table>
				<div class="webdiv" id="webdiv">
					<iframe src="" class="webjsp" id="webjsp_3" frameborder="0"></iframe>
				</div>

				<div class="tab_pageControl" id="tab3_pageControl">
					<div class="tab_pageControlText" id="tab3_pageControlText" style="">当前显示1到1条，共1条记录</div>
					<ul>
						<li>首页</li>
						<li>上一页</li>
						<li>1</li>
						<li>下一页</li>
						<li>尾页</li>
					</ul>
				</div>
			</div>


		</div>
	</div>
</body>

<script type="text/javascript">
		
		function selectAction(id){
			if(id == "tab3_selectButton"){
				document.getElementById("webjsp_3").src = "infochange.html";
			}
			if(id == "tab2_selectButton"){
				document.getElementById("webjsp_2").src = "paymentinfo.html";
			}
		}


		function selectInputContent(obj){
			obj.focus();
			obj.select();
		}
		
		//切换tab
		function tabclick(obj){
			obj.style.backgroundColor = "#C9E5FD";
			obj.style.color = "#003366";
			var tabs = document.getElementsByClassName("tabli");
			var tabDivs = document.getElementsByClassName("tabDiv");
			for (var i = 0; i < tabs.length; i++) {
				if(obj != tabs[i]){
					tabs[i].style.backgroundColor = "";
					tabs[i].style.color = "#003366";
					tabDivs[i].style.display = "none";
				}else{
					tabDivs[i].style.display = "inline";
				}
			}
		}
		
		
	</script>
</html>