<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看所有课程</title>
<link href="http://localhost:8080/LXKT/css/bootstrap.min.css" rel="stylesheet">

</head>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<body>
<jsp:include page="../../home.jsp"/>

<div id="section">
<h3>所有课程信息</h3>
</div>
 <table class="table table-honver">
                <tr>
                    <th>id</th>
                    <th>课程名</th>                   
                    <th>课程销量</th>
                    <th>课程评分</th>
                    <th>上线日期</th>
                    <th>最近更新日期</th>
                </tr>
                <c:forEach items="${listCourse}" var="cou">
                <tr>
                    <td>${cou.couId }</td>
                    <td>${cou.couName }</td>
                    <td>${cou.couSales}</td>
                    <td>${cou.couGrade}</td>
                    <td>${cou.couLinetime}</td>
                    <td>${cou.couUpdatetime}</td>
                    <td><button class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-pencil"></span>增加</button></td>
                    <td><button class="btn btn-warning btn-sm"><span class="glyphicon glyphicon-trash"></span>删除</button></td>
                </tr>
            </c:forEach>
            </table>

 <div class="row">
        <div class="col-md-6">
                  当前${pageInfo.pageNum }页，总共${pageInfo.pages }页，总共${pageInfo.total }条记录
        </div>
        <div class="col-md-6">
            <nav aria-lable="Page navigation">
                <ul class="pagination">

                    <li><a href="${path }/getCourseList.do?pageNum=1">首页</a></li>

                    <c:if test="${pageInfo.hasPreviousPage  }">
                        <li>
                            <a href="${path }/getCourseList.do?pageNum=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums  }" var="page">
                        <c:if test="${page==pageInfo.pageNum }">
                            <li class="active"><a href="${path }/getCourseList.do?pageNum=${page}">${page}</a></li>
                        </c:if>
                        <c:if test="${page!=pageInfo.pageNum }">
                            <li><a href="${path }/getCourseList.do?pageNum=${page}">${page}</a></li>
                        </c:if>
                    </c:forEach>

                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                            <a href="${path }/getCourseList.do?pageNum=${pageInfo.pageNum+1 }" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <li><a href="${path }/getCourseList.do?pageNum=${pageInfo.pages}">末页</a></li>

                </ul>
            </nav>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery.js"></script>
 <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>