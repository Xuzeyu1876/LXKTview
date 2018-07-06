<%@page import="com.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
<style>
.center{text-align:center}
.comment{text-align:center}
.comment-send{text-align:center}
</style>
<head>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../home.jsp"/>
<div style="text-align: center;">
<iframe width="800" height="600" src="https://ke.qq.com/webcourse/index.html#course_id=231577&amp;term_id=100273169&amp;taid=1464734172022937&amp;vid=a14198i8y2h"></iframe>
</div>
<div class="comment">
<div class="comment-send">
<textarea cols="80" rows="5"></textarea>
<form action="${pageContext.request.contextPath}/course/getComment.do?pageNum=1" method="post">
<button type="submit" id="comment_send1">提交评论</button></form>
</div>
</div>
</body>
</html>
