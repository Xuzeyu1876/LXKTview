<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/LXKT/css/course_list.css">
<script type="text/javascript" src="http://localhost:8080/LXKT/js/course_list.js"></script>
<script src="http://localhost:8080/LXKT/js/jquery.min.js"></script>
<script src="http://localhost:8080/LXKT/js/jquery.min.js "></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>course_list</title>
</head>
<body>
<jsp:include page="home.jsp"/>
<a name="top" id="top"></a>
<script type="text/javascript">
$(function(){
	showCourseList(1);
});
</script>
<aside id=c01>
	<div id=c02>
		<a href="#top">
		<i class="font-icon-to-up">^</i>
		</a>
	</div>
</aside>
<div id=c05>
	<div id=c03>
		<h2>全部任务</h2>
		<div id=c04></div>
	</div>
</div>
</body>
</html>