//基本信息页面所有JS
		var eachPageFirstRowIndex=0;
		var pageSize=10;
		var allNumber=0;
		
		//获取输入框内容
		function getTab1InputText(){
			var str = $.trim(document.getElementById("tab1_getText").value);
			return str;
		}
		
		//点击查询按钮执行
		function getStaffFirstOnClick(eachPageFirstRowIndex,pageSize){
			var str = getTab1InputText();
			if(str != ""){
				eachPageFirstRowIndex=0
				getStaffCount(str);
				getStaffSelect(str,eachPageFirstRowIndex,pageSize);
				$("#currentPageIndex").text(1);
				$("#currentPageIndex").text(eachPageFirstRowIndex+1);$("#tab1_pageControlText").html("当前显示:"+1+"到"+getRows()+",共"+allNumber+"条记录.");

			}else{
				alert("请输入个人编号或姓名!");
			}
			
		}
		
		//点击分页按钮执行
		function getStaffOtherOnClick(eachPageFirstRowIndex, pageSize){
			var str = getTab1InputText();
			if(str != ""){
				getStaffSelect(str,eachPageFirstRowIndex,pageSize);
			}else{
				alert("请输入个人编号或姓名!");
			}
			
		}
		
		function getStaffSelect(str,eachPageFirstRowIndex,pageSize){
			$.ajax({
				type:"POST",
				url:"getStaffAllSelect/"+str+"/"+eachPageFirstRowIndex+"/"+pageSize,
				async:false,
				dataType:"json",
				success:function(data){
					$(".staffallinfotr").remove();
					for(i=0;i<data.length;i++){
						var trindex = eachPageFirstRowIndex+i+1;
						$("#table1").append('<tr class="staffallinfotr"><td>'+trindex+'</td><td>'+data[i].sid+'</td><td>'+data[i].sino+'</td><td>'+data[i].sname+'</td><td>'+data[i].ssex+'</td><td>'+data[i].snation+'</td><td>'+data[i].sbirth+'</td><td>'+data[i].sdaj+'</td><td>'+data[i].pbase+'</td><td>'+data[i].cid+'</td><td>'+data[i].csn+'</td><td>'+data[i].sstate+'</td></tr>');
					}
				},
				error:function(){
					alert("系统错误!请联系管理员.");
				},
				complete : function(XMLHttpRequest,status){
					　　　if(status=='timeout'){
					　　　　　 ajaxTimeoutTest.abort();  
					　　　　  alert("超时");  
					　　　}  
				}  
				
			});
		}
		
		function getStaffCount(str){
			$.ajax({
				type:"POST",
				url:"getStaffAllSelectNumber/"+str,
				async:false,
				dataType:"json",
				success:function(data){
					var exp = null;
					if(data.result != exp){
						var selectCountNumber = Number(data.result);
						allNumber = selectCountNumber;
					}
				},
				error:function(){
					alert("系统错误!请联系管理员.");
				},
				complete : function(XMLHttpRequest,status){
					　　　if(status=='timeout'){
					　　　　　 ajaxTimeoutTest.abort();  
					　　　　  alert("超时");  
					　　　}  
				}  
				
			});
		}
		
		//获取当前页面表格行数
		function getRows(){
			var rows = $(".staffallinfotr").length;
			return rows;
		}
		
		//查询按钮执行方法
		$(function(){
			$("#tab1_selectButton").unbind('click').click(function(){
				getStaffFirstOnClick(eachPageFirstRowIndex,pageSize);
			});
		});
		
		//首页按钮执行方法
		$(function(){
			$("#selectStaffAllInfoFirstPage").unbind('click').click(function(){
				var str = getTab1InputText();
				if(str != ""){
					getStaffFirstOnClick(eachPageFirstRowIndex,pageSize);
				}
			});
		});
		
		//上一页按钮执行方法
		$(function(){
			$("#selectStaffAllInfoPreviousPage").unbind('click').click(function(){
				if(eachPageFirstRowIndex > 0){
					eachPageFirstRowIndex--;
					getStaffOtherOnClick(eachPageFirstRowIndex*pageSize,pageSize);
					$("#currentPageIndex").text(eachPageFirstRowIndex+1);
					var from = eachPageFirstRowIndex*pageSize+1;
					var to = eachPageFirstRowIndex*pageSize+getRows();
					$("#tab1_pageControlText").html("当前显示:"+from+"到"+to+",共"+allNumber+"条记录.");
				}
			});
		});
		
		//下一页按钮执行方法
		$(function(){
			$("#selectStaffAllInfoNextPage").unbind('click').click(function(){
				var str = getTab1InputText();
				if(str != ""){
					var currentPageIndex = Number($("#currentPageIndex").text());
					var countPage = Math.floor((allNumber + pageSize - 1)/pageSize);
					if(currentPageIndex < countPage){
						eachPageFirstRowIndex++;
						getStaffOtherOnClick(eachPageFirstRowIndex*pageSize,pageSize);

						$("#currentPageIndex").text(eachPageFirstRowIndex+1);
						var from = eachPageFirstRowIndex*pageSize+1;
						var to = eachPageFirstRowIndex*pageSize+getRows();
						$("#tab1_pageControlText").html("当前显示:"+from+"到"+to+",共"+allNumber+"条记录.");
					}
				}
			});
		});
		
		//尾页按钮执行方法
		$(function(){
			$("#selectStaffAllInfoLastPage").unbind('click').click(function(){
				var str = getTab1InputText();
				if(str !=""){
					eachPageFirstRowIndex = Math.floor((allNumber + pageSize - 1)/pageSize) - 1;
					getStaffOtherOnClick(eachPageFirstRowIndex*pageSize,pageSize);
					$("#currentPageIndex").text(eachPageFirstRowIndex+1);
					var from = eachPageFirstRowIndex*pageSize+1;
					var to = eachPageFirstRowIndex*pageSize+getRows();
					$("#tab1_pageControlText").html("当前显示:"+from+"到"+to+",共"+allNumber+"条记录.");
				}
			});
		});
		
		
		//查询按钮绑定回车键
		document.onkeydown = function (e) { 
			var theEvent = window.event || e; 
			var code = theEvent.keyCode || theEvent.which; 
			if (code == 13) { 
			   $("#tab1_selectButton").click(); 
			} 
		} 
		