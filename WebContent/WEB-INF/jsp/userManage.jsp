<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery-3.3.1.min.js"></script>

<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:100px;
    float:left;
    padding:5px; 
}
#section {
    width:350px;
    float:left;
    padding:10px; 
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px; 
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userManage</title>
</head>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>

<body>
<jsp:include page="../../home.jsp"/>
<div id="header">
<h2>老夏课堂后台管理</h2>
</div>

<div id="nav">
<a href="test1">查看所有用户<br>
Paris<br>
Tokyo<br>
</div>


</body>
</html>