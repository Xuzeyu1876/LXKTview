<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">




<title>老夏课堂后台管理</title>
<!-- 
<link href="http://localhost:8080/LXKT/css/bootstrap.min.css" rel="stylesheet">
<script src="http://localhost:8080/LXKT/js/bootstrap.min.js"></script>
<script src="http://localhost:8080/LXKT/js/jquery-3.3.1.min.js"></script> -->
<link href="http://localhost:8080/LXKT/css/bootstrap.min.css" rel="stylesheet">
<link href="http://localhost:8080/LXKT/css/bootstrap-theme.min.css" rel="stylesheet">

</head>
<body>
<jsp:include page="home.jsp"/>
<!--     <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">老夏课堂后台管理</a>
        </div>
    
      </div>
    </nav> -->

     <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
            <li><a href="userShow">用户管理</a></li>
            <li><a href="permissionShow"  >角色权限管理</a></li>
             <li><a href="courseShow">课程管理</a></li>
            <li><a href="addCourse">添加课程</a></li>          
            <li><a href="commentShow">评论管理</a></li>
             
          </ul>
        
         
        </div>
       
		<div class="col-md-6 column">
		</div>
		<div class="col-md-4 column">
		</div>
	</div>

<script src="http://localhost:8080/LXKT/js/jquery.js"></script>
 <script src="http://localhost:8080/LXKT/js/bootstrap.min.js"></script>

</body>
</html>