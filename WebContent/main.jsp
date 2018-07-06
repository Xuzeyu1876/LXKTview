<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
<script src="./js/test.js"></script>
<script src="./js/jquery.min.js"></script>  
<script type="text/javascript" src="./js/jquery.min.js"></script>
<script type="text/javascript" src="./js/jquery-1.4.1.min.js"></script>
<script src="./js/jquery.js"></script>
<script src="./js/bootstrap.min.js"></script>
<head>
<title>Insert title here</title>
</head>
<script>
$(function(){
	var path=getpath();
	alert(""+path);
	document.getElementById("test").innerHTML="<a href=\""+path+"/course/getComment.do?pageNum=1\"><img src=\"http://n.sinaimg.cn/translate/w750h422/20180102/c_Ky-fyqefvx1274319.jpg\" width=\"450\" height=\"334\"></a>";
});

</script>
<body>
<div>
<p>课程列表</p>
<div><a href="home.jsp?page=/WEB-INF/jsp/course.jsp"><img src="http://n.sinaimg.cn/translate/w750h422/20180102/c_Ky-fyqefvx1274319.jpg" width="450" height="334"></a>
<a href="${pageContext.request.contextPath}/course/getComment.do?pageNum=1"><img src="http://n.sinaimg.cn/translate/w750h422/20180102/c_Ky-fyqefvx1274319.jpg" width="450" height="334"></a>
<div id="test"></div>
<a href="/course/getComment.do?pageNum=1"><img src="http://n.sinaimg.cn/translate/w750h422/20180102/c_Ky-fyqefvx1274319.jpg" width="450" height="334"></a></div>
</div>
</body>
</html>
