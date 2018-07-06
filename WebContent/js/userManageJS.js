$(function(){
	showAllUser(1);
});

function showModal(obj){
	 $.ajax({  
	        type : "GET",  
	        url : "./user/getUserList2",
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取 
	        	$('#tableshow1').html("");
	        	var str =" <tr><th></th><th>序号</th><th>用户名</th><th>邮箱</th></tr>";
	        	str += " <c:forEach > <tr>";        
	            for (var i = 0; i < datas.list.length; i++) {	            	
	            	var id=i+1;
	            	str +="<td><input type=\"checkbox\" value='"+i+"'></td> ";
	            	str +="<td>"+id+"</td> ";	            	
	            	str +="<td>"+datas.list[i].username+"</td> ";
	            	str +="<td>"+datas.list[i].userMail+"</td> </tr> </c:forEach>";
	            	
	            }   
	            var select = $("#mydiv");
	            select.append("<label><input type=\"radio\" name=\"perRadios\" id=\"perRadios1\" value=\"1\" >普通用户</label>&nbsp<label><input type=\"radio\" name=\"perRadios\" id=\"perRadios2\" value=\"0\" >管理员</label></br> <a class='btn btn-primary ' >提交</a>" );     	 
	            document.getElementById("tableshow1").innerHTML=str;
	        }  
		
	    });

	
	 
	
}
function changeRole(obj){
	 var td=$(obj).parent();
	 var roleType=td.prev().html().trim();
	 alert(roleType);
	 
	
}


function showAllUser(pageNum) {  
	 $.ajax({  
	        type : "GET",  
	        url : "./user/getUserList?pageNum="+pageNum ,
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取 
	        	$('#tableshow1').html("");
	        	var str =" <tr><th></th><th>序号</th><th>用户名</th><th>邮箱</th><th>角色类型</th><th>最后登陆时间</th><th>用户状态</th><th>操作</th></tr>";
	        	str += " <c:forEach > <tr>";
	        	var select = $("#tableshow1");	        
	            for (var i = 0; i < datas.list.length; i++) {	            	
	            	var id=i+1;
	            	if(datas.list[i].userStatus==0){
	            		var userstatus="使用中"
	            		var operatebutton="<div id=\""+id+"\"><button class=\"btn btn-primary btn-sm\"  onclick=\"changeRole(this)\"><span class=\"glyphicon glyphicon-pencil\"></span>配置</button>&nbsp<button class=\'btn btn-primary btn-sm\' onclick=\"confirmdelete()\" href=\"#\">删除</button></div>";
	            		
	            	}
	            		
	            	else{
	            		var userstatus="已注销";
	            		var operatebutton="<div id=\""+id+"\"><button class=\"btn btn-primary btn-sm\"  onclick=\"changeRole(this)\"><span class=\"glyphicon glyphicon-pencil\"></span>配置</button>&nbsp<button class=\'btn btn-primary btn-sm\' onclick=\"confirmdelete()\" href=\"#\">还原</button></div>";

	            		
	            	}
	            		
	            	str +="<td><input type=\"checkbox\" value='"+i+"'></td> ";
	            	str +="<td>"+id+"</td> ";	            	
	            	str +="<td>"+datas.list[i].username+"</td> ";
	            	str +="<td>"+datas.list[i].userMail+"</td> ";
	            	str +="<td>"+datas.list[i].roleName+"</td> ";
	            	str +="<td>"+datas.list[i].latestLoginTime+"</td> ";
	            	str +="<td>"+userstatus+"</td> ";
	            	str +="<td>"+operatebutton+"</td></tr> </c:forEach>";
	            }             
         	 document.getElementById("tableshow1").innerHTML=str;
         	 
             var strpage = "";
             strpage+="<li><a href=\"javascript:void(0)\" onclick=\"showAllUser(1)\">首页</a></li>";
             var pre=datas.pageNum-1;
             if(datas.hasPreviousPage){
             strpage+="<li><a href=\"javascript:void(0)\" onclick=\"showAllUser("+pre+")\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>";
             }
             var length=datas.navigatepageNums.length+1;
             for(var i=1;i<length;i++){
             	if(i==datas.pageNum){
             		strpage+="<li class=\"active\"><a href=\"javascript:void(0)\" onclick=\"showAllUser("+i+")\">"+i+"</a></li>";
             	}else{
             		strpage+="<li><a href=\"javascript:void(0)\" onclick=\"showAllUser("+i+")\">"+i+"</a></li>";
             	}
             }
             var next=datas.pageNum+1;
             if(datas.hasNextPage){
             	strpage+="<li><a href=\"javascript:void(0)\" onclick=\"showAllUser("+next+")\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>";
             }
             strpage+="<li><a href=\"javascript:void(0)\" onclick=\"showAllUser("+datas.pages+")\">末页</a></li>";
             strpage+=" 当前"+datas.pageNum+" 页，总共"+datas.pages+" 页，总共"+datas.total +"条记录";
            
             document.getElementById("pageshow").innerHTML=strpage;
	        }  
		
	    });

}  


function confirmdelete(){
    if (!confirm("确认要删除？")) {  window.event.returnValue = false;  }  
}
