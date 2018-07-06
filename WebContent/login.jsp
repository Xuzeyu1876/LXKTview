<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<style>
.main{
    text-align: center; /*让div内部文字居中*/
    background-color: grey;
    border-radius: 20px;
    width: 300px; 
    height: 100px;
    margin: auto;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    padding-top:10px;
}
</style>
<body>
<jsp:include page="home.jsp"></jsp:include>
<div class="main">
<form name="login_form" action="${pageContext.request.contextPath}/user/login" method="post">
<input type="text" name="userMail" placeholder="邮箱"><br>
<input type="text" name="password" placeholder="密码"><br>
<input type="submit" value="登录">
</form>
</div>
</body>
</html>