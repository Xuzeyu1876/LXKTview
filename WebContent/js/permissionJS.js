$(function(){
	showAllRole();
	

});
$(document).ready(function(){

    $("#per_name").blur(function(){
    	if($("#per_name").val()=="")
    		$("#errorName").html("权限名不能为空");
    })
     $("#per_name").focus(function(){
    		$("#errorName").html("");
    })
     $("#per_url").blur(function(){
    	if($("#per_url").val()=="")
    		$("#errorUrl").html("Url不能为空");
    })
         $("#per_url").focus(function(){
    		$("#errorUrl").html("");
    })
        $("#per_name_info").blur(function(){
    	if($("#per_name_info").val()=="")
    		$("#errorNameinfo").html("权限名不能为空");
    })
     $("#per_name_info").focus(function(){
    		$("#errorNameinfo").html("");
    })
     $("#per_url_info").blur(function(){
    	if($("#per_url_info").val()=="")
    		$("#errorUrlinfo").html("Url不能为空");
    })
         $("#per_url_info").focus(function(){
    		$("#errorUrlinfo").html("");
    })

});



function updateRolePermission(obj){
	 var td=$(obj).parent();
	 var checkboxId=td.prev().prev().prev().prev().html().trim();
	 //变为可编辑状态
	 $(":checkbox[name="+checkboxId+"]").attr("disabled",true); 
 	var str ="<td id=\""+checkboxId+"\"><button class=\"btn btn-primary btn-sm\"  onclick=\"updateCheckBox(this)\"><span class=\"glyphicon glyphicon-pencil\"></span>修改权限</button>&nbsp<button class=\'btn btn-primary btn-sm\' onclick=\"confirmdelete()\" href=\"#\">删除</button></td></tr> </c:forEach>";
	 document.getElementById(checkboxId).innerHTML=str;	
	alert("修改成功！");
 
	
	 
} 

function updateCheckBox(obj){
	 var td=$(obj).parent();
	 var checkboxId=td.prev().prev().prev().prev().html().trim();
	 //变为可编辑状态
	 $(":checkbox[name="+checkboxId+"]").attr("disabled",false); 
 	var str ="<td id=\""+checkboxId+"\"><button class=\"btn btn-primary btn-sm\"  onclick=\"updateRolePermission(this)\"><span class=\"glyphicon glyphicon-file\"></span>提交修改</button>&nbsp<button class=\'btn btn-primary btn-sm\' onclick=\"confirmdelete()\" href=\"#\">删除</button></td></tr> </c:forEach>";
	 document.getElementById(checkboxId).innerHTML=str;	
} 

function showAllRole() {  
	 $.ajax({  
	        type : "GET",  
	        url : "./showAllRole",
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取 
	        	$('#tableshow').html("");
	        	var str =" <tr><th></th><th>序号</th><th>角色ID</th><th>角色名</th><th>角色权限</th><th>角色状态</th><th>操作</th></tr>";
	        	str += " <c:forEach > <tr>";
	        	var select = $("#tableshow");	        
	            for (var i = 0; i < datas.list.length; i++) {	            	
	            	var id=i+1;
	            	var s=showRoleInfo(datas.list[i].roleId);
	            	str +="<td><input type=\"checkbox\" value='"+i+"'></td> ";
	            	str +="<td>"+id+"</td> ";	            	
	            	str +="<td>"+datas.list[i].roleId+"</td> ";
	            	str +="<td>"+datas.list[i].roleName+"</td> ";
	            	//alert(showRoleInfo(datas.list[i].roleId));
	            	str +="<td>"+s+"</td> ";
	            	if(datas.list[i].roleStatus==1)
	            		var status="使用中";
	            	else
	            		var status="已注销"
	            	str +="<td>"+status+"</td> ";
	            	str +="<td id=\""+datas.list[i].roleId+"\"><button class=\"btn btn-primary btn-sm\"  onclick=\"updateCheckBox(this)\"><span class=\"glyphicon glyphicon-pencil\"></span>修改权限</button>&nbsp<button class=\'btn btn-primary btn-sm\' onclick=\"confirmdelete()\" href=\"#\">删除</button></td></tr> </c:forEach>";
	            	//str +="<td><a class=\'btn btn-primary \' onclick=\"confirmdelete()\" href=\"#\">删除</a></td></tr> </c:forEach>";
	            }             
          	 document.getElementById("tableshow").innerHTML=str;
        
          	//alert($('#tableshow tr:eq(1) th:eq(2)').html());
	        }  
		
	    });

}  


function showRoleInfo(roleId){
/* 	var td=$(obj).parent();
	var RoleId=td.prev().prev().prev().html().trim();
	var RoleName=td.prev().prev().html().trim();	
	var RoleStatus=td.prev().html().trim();
	$("#role_id_info").val(RoleId);
	$("#role_name_info").val(RoleName);
	$("#roleRadioInfo").html("");
	var roleRadios = $("#roleRadioInfo");
	roleRadios.append("<label><input type=\"radio\" name=\"roleRadioInfo\" id=\"roleRadioInfo1\" value=\"1\" >生效角色</label><label><input type=\"radio\" name=\"roleRadioInfo\" id=\"roleRadioInfo2\" value=\"0\" >注销角色</label>");   
	$(":radio[name='roleRadioInfo'][value=\'"+RoleStatus+"\']").attr("checked","checked"); */
	var s ="";
	$.ajax({  
	        type : "GET",  
	        url : "./showPerByRole?RoleId="+roleId,
	        dataType : 'json', 
	        async : false,
	        success : function(datas) {//返回list数据并循环获取 	  	        	
	        	if(datas!=null){
	        	//$('#role_per_info').html("");	        	
	            for (var i = 0; i < datas.length; i++){	             
	            	if(datas[i].isOwnByRole==1){
	            		s += "<label><input type=\"checkbox\" name=\""+roleId+"\"value='"+datas[i].perId+"' disabled=true checked>" + datas[i].perName + "</label>&nbsp&nbsp&nbsp" ;   
		            		}            	
	            	else
	            		s +="<label><input type=\"checkbox\" name=\""+roleId+"\"value='"+datas[i].perId+"'disabled=true>" + datas[i].perName + "</label>&nbsp&nbsp&nbsp";	            			            	
	            	}	            
	        	}	        	 
	        }	
	    });	
	return s;

	
	
}
function addRole(){
	if($("#role_name").val()!=""){
		var perArray="";  
		$('input[name="role_per"]:checked').each(function(){  
			perArray+=$(this).val();//向数组中添加元素  			
		});  
		 $.ajax({
				type:"GET",
				contentType: 'text/json,charset=utf-8',
			    dataType: "json",
				url:"./addRole?roleName="+$("#role_name").val()+"&roleStatus="+$("input[type='radio']:checked").val()+"&perList="+perArray,
				success:function(data){
					if(data=="success"){
						alert("添加成功！");
						perArray="";
						
					}
					else {
						alert("添加失败！");
					}
				}		
			}); 
		
	}
	else{
		alert("信息不能为空！");
	}
}
function showPerInModal(){  
	 $.ajax({  
	        type : "GET",  
	        url : "./showPerInModal",
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取 
	        	if(datas!=null){
	        	$('#role_per').html("");
	        	var select = $("#role_per");
	            for (var i = 0; i < datas.length; i++)  
	            	select.append("<label><input type=\"checkbox\" value='"+datas[i].perId+"' name=\"role_per\">" + datas[i].perName + "</label></br>");   
	              
	        	}
	    
	        }  
	    });
	 $('#newRoleModal').modal('show'); 

}  


function addPermission(){
	if($("#per_name").val()!=""&&$("#per_url").val()!=""){	
			 $.ajax({
				type:"GET",
				contentType: 'text/json,charset=utf-8',
			    dataType: "json",
				url:"./addPermission?perName="+$("#per_name").val()+"&perUrl="+$("#per_url").val(),
				success:function(data){
					if(data=="success"){
						alert("添加成功！");
						
					}
					else {
						alert("添加失败！");
					}
				}		
			}); 
		}
	else{
		alert("信息不能为空！");
		
	}
	
	}

	 

function showAllPermission() {  
	 $.ajax({  
	        type : "GET",  
	        url : "./showAllPermission",
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取 
	        	$('#tableshow').html("");
	        	var str =" <tr><th></th><th>序号</th><th>权限名</th><th>权限URL</th><th>权限状态</th><th>操作</th></tr>";
	        	str += " <c:forEach > <tr>";
	        	var select = $("#tableshow");	        	
	            for (var i = 0; i < datas.list.length; i++) {
	           		var id=i+1;
	            	str +="<td><input type=\"checkbox\" value='"+i+"'></td> ";
	            	str +="<td id=\"perId\">"+id+"</td> ";
	            	str +="<td>"+datas.list[i].perName+"</td> ";
	            	str +="<td>"+datas.list[i].perUrl+"</td> ";
	            	if(datas.list[i].perStatus==1)
	            		var status="使用中";
	            	else
	            		var status="已失效"
	            	str +="<td>"+status+"</td> ";
	            	str +="<td><a class=\'btn btn-primary btn-sm\'   onclick=\"perConfirmDelete()\" href=\"#\">注销</a></td></tr> </c:forEach>";
	 
	            }             
            	 document.getElementById("tableshow").innerHTML=str;
	        }  
	    });
  
}  

function showPermission() {  
	 $.ajax({  
	        type : "GET",  
	        url : "./showPermission?userType="+$("input[type='radio']:checked").val(),
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取 
	        	$('.checkbox').html("");
	        	var select = $(".checkbox");
	            for (var i = 0; i < datas.length; i++) {  
	            	select.append("<label><input type=\"checkbox\" value='"+i+"'>" + datas[i] + "</label>");   
	            }  
	    
	        }  
	    });
 
} 

/* 修改权限模式框呼出 */
function showPerInfo(obj){ 
	var td=$(obj).parent();
	var perId=td.prev().prev().prev().prev().html().trim();
	var perName=td.prev().prev().prev().html().trim();
	var perUrl=td.prev().prev().html().trim();
	var perStatus=td.prev().html().trim();
	$("#per_id_info").val(perId);
	$("#per_name_info").val(perName);
	$("#per_url_info").val(perUrl);
	$("#perradio").html("");
	var perRadios = $("#perradio");
	perRadios.append("<label><input type=\"radio\" name=\"perRadios\" id=\"perRadios1\" value=\"1\" >存在</label><label><input type=\"radio\" name=\"perRadios\" id=\"perRadios2\" value=\"0\" >注销</label>");   
	$(":radio[name='perRadios'][value=\'"+perStatus+"\']").attr("checked","checked");  
	$('#infoModal').modal('show');   	
}

