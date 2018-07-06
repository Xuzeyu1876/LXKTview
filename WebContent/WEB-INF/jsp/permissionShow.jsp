<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>权限管理</title>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div id="section">
<h3>权限管理界面</h3>
</div>
<div class="modal fade" id="newRoleModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="nRoleModalLabel">新增角色</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="role_name">角色名</label>
                        <input type="text" name="role_name" class="form-control" id="role_name" placeholder="角色名称">
                    	<p id="RerrorName" class="error"></p><br>
                    </div>
                    <div class="form-group" >
                        <label for="role_permission">角色权限</label>                                       
						<div class="checkbox" id="role_per">		
						</div>                   	
                    </div>
                    <div class="form-group">
        			<label for="role_status">角色状态</label>
           			<div class="radio" id="roleRadio">
           				<label><input type="radio" name="roleRadios" id="roleRadios1" value="1" checked>生效角色</label>
			   			<label><input type="radio" name="roleRadios" id="roleRadios2" value="0" >注销角色</label>			
   				
					</div>		                    	
     			</div>                   
                </div>              
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                    <button type="button" id="btn_submit1" class="btn btn-primary" data-dismiss="modal" onclick="addRole()">
                    	<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true" ></span>添加</button>
                </div>
            </div>
        </div>
    </div> 
    
    <div class="modal fade" id="RoleInfoModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="RoleInfoModalLabel">角色信息</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="role_name_info">角色名</label>
                        <input type="text" name="role_name_info" class="form-control" id="role_name_info" placeholder="角色名称">
                    	<p id="RerrorName" class="error"></p><br>
                    </div>
                    <div class="form-group">
        				<label for="role_status_info">角色状态</label>
           				<div class="radio" id="roleRadioInfo">  				
						</div>		                    	
     				</div> 
     				 <div class="form-group" >
                        <label for="role_permission">角色权限</label>                                       
						<div class="checkbox" id="role_per_info">		
						</div>                   	
                    </div>               
                </div>              
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                    <button type="button" id="btn_submit2" class="btn btn-primary" data-dismiss="modal" onclick="updateRole()">
                    	<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true" ></span>提交</button>
                </div>
            </div>
        </div>
    </div>       
<div class="container">
	<div class="row clearfix">
		<div class="col-md-8 column">							
					<div class="col-md-2 column">
						<button class="btn btn-primary"  onclick="showAllPermission()"  >权限管理</button>
					</div>
					<div class="col-md-2 column">
						<button class="btn btn-primary"  onclick="showAllRole()" >角色管理</button>
					</div>
					<div class="col-md-6 column">									
    				</div> 	
					<div class="col-md-2 column">
						<button class="btn btn-primary" onclick="showPerInModal()">新建角色</button>
					</div>								 										
		</div>				    							
	</div>					
</div>
		<div class="col-md-10 column" >
 			<table class="table table-bordered table-striped " id="tableshow">
            </table>
            </div>
	
</body>
<script src="http://localhost:8080/LXKT/js/permissionJS.js"></script>
</html>