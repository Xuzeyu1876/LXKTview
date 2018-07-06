<%@page import="com.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
<!-- 新 Bootstrap 核心 CSS 文件 -->  
 <link  href="http://localhost:8080/LXKT/css/bootstrap.min.css" rel="stylesheet">  
  
<!-- 可选的Bootstrap主题文件（一般不用引入）   -->
<link href="http://localhost:8080/LXKT/css/bootstrap-theme.min.css" rel="stylesheet">
  
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->  
<script src="http://localhost:8080/LXKT/js/jquery.min.js"></script>  
  
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->  
<script src="http://localhost:8080/LXKT/js/bootstrap.min.js"></script> 
<script type="text/javascript" src="http://localhost:8080/LXKT/js/jquery.js"></script>
<script src="http://localhost:8080/LXKT/js/test.js"></script>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
<style>
.menu{background:DimGray;z-index:100;top:0px;height:70px;} 
.menu1{background:white;top:0px;height:80px;} 
.mid1{position:absolute;left:100px;top:10px}
.mid2{position:absolute;left:200px;top:10px}
.mid3{position:absolute;left:400px;top:10px}
.mid4{position:absolute;left:600px;top:10px}
.mid5{position:absolute;left:800px;top:10px}
.mid6{position:absolute;left:1000px;top:10px}
.mid7{position:absolute;left:1200px;top:10px}
.page{width:100%;height:100%}
</style>
<%String cp = request.getContextPath(); %>
<script>
var path=getPath();
$(function(){
	isLogin();
//	ajaxload("main.jsp");
});

/* function login(){
	 $.ajax({  
	       type: "GET",  
	       url: "./user/selectPage",  
	       contentType: 'text/json,charset=utf-8',
	       dataType: "json",
	       success: function(data){
	    	   ajaxload(data);
	       }
	 });
}

function ajaxload(local){
    htmlobj=$.ajax({url:local,async:false});
 //   $(".mainPage").html("asfdjnasjk fhuis");
  	  document.getElementById("mainPage").innerHTML=htmlobj.responseText;
} */
function isLogin(){
	 $.ajax({  
	       type: "GET",  
	       url: path+"/user/isLogin",  
	       contentType: 'text/json,charset=utf-8',
	       dataType: "json",
	       success: function(data){
	    	   if(data!=null){
	    		   var str = "<font size=\"6px\" color=\"white\"><a href=\"./user/showMyPage\" onclick=\"javascript:void(0)\" style=\"color:black\">";
	    		   str += "个人中心"+"</a></font>";
	    		   document.getElementById("userLogin").innerHTML=str;
	    		   var strOut = "<font size=\"6px\" color=\"white\"><a href=\"./user/loginOut\" onclick=\"/user/loginOut\" style=\"color:black\">注销</a></font></div>";
	    		   document.getElementById("register").innerHTML=strOut;
	 
	    	   }
	    	   else{
	    		  
	    	   }
	    	   
	       }
	 });
	
}</script>
</head>
<%String pagename = request.getParameter("page"); %>

<body>
<div class="menu col-lg-12">
<div class="col-lg-0.5   mid1"><font size="6px" color="white"><a href="login.jsp" style="color:black">logo</a></font></div>
<div class="col-lg-0.5   mid2"><font size="6px" color="white"><a href="http://localhost:8080/LXKT/index.jsp" style="color:black">首页</a></font></div>
<div class="col-lg-0.5   mid3"><font size="6px" color="white"><a href="login.jsp" style="color:black">视频课程</a></font></div>
<div class="col-lg-0.5   mid4"><font size="6px" color="white"><a href="./sourceDownload" style="color:black">资料下载</a></font></div>
<div class="col-lg-0.5   mid5"><font size="6px" color="white"><a href="http://localhost:8080/LXKT/btest.jsp" style="color:black">后台管理</a></font></div>
<div class="col-lg-0.5   mid6" id="userLogin"><font size="6px" color="white"><a href="http://localhost:8080/LXKT/login.jsp"  style="color:black">登录</a></font></div>
<div class="col-lg-0.5   mid7" id="register"><font size="6px" color="white"><a href="http://localhost:8080/LXKT/register.jsp" style="color:black">注册</a></font></div></div>
</body>
</html>