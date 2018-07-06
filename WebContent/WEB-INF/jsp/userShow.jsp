<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%--      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看所有用户</title>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>



<h3>用户信息</h3>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<form class="form-horizontal" role="form"  action="${path }/user/select.do" method="post"  >
				<div class="form-group">
					 <label for="inputname" class="col-sm-2 control-label">用户名</label>					
					<div class="col-sm-4">
						<input type="text" class="form-control" name="username"/>
					</div>
					<div class="col-md-1 column">
						 <button type="submit" class="btn btn-default" >查找</button>
					</div>
					<%-- <div class="col-md-4 column">
						 <a class='btn btn-primary ' href="${path }/user/getUserList.do?pageNum=1">显示现有用户</a>
					</div> --%>
							
				</div>	
			</form>		
		</div>
		<div class="col-md-1 column">
						 <a class='btn btn-primary ' href="${path }/addUser">添加新用户</a>
					</div>
					<div class="col-md-1 column">
						 <a class='btn btn-primary ' onclick="showModal()">批量授权</a>
					</div>		
	</div>
</div>
	<div class="col-md-10 column" id="mydiv">
 	<table class="table table-bordered table-striped " id="tableshow1">
            </table>
            </div>
          <div  class="col-md-10 column" id=x15>
		<nav aria-lable="Page navigation">
        	<ul class="pagination" id="pageshow"></ul>
    	</nav>
    </div>

<%--  <div class="row">
        <div class="col-md-6">
                  当前${pageInfo.pageNum }页，总共${pageInfo.pages }页，总共${pageInfo.total }条记录
        </div>
        <div class="col-md-6">
            <nav aria-lable="Page navigation">
                <ul class="pagination">

                    <li><a href="${path }/user/getUserList.do?pageNum=1">首页</a></li>

                    <c:if test="${pageInfo.hasPreviousPage  }">
                        <li>
                            <a href="${path }/user/getUserList.do?pageNum=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums  }" var="page">
                        <c:if test="${page==pageInfo.pageNum }">
                            <li class="active"><a href="${path }/user/getUserList.do?pageNum=${page}">${page}</a></li>
                        </c:if>
                        <c:if test="${page!=pageInfo.pageNum }">
                            <li><a href="${path }/user/getUserList.do?pageNum=${page}">${page}</a></li>
                        </c:if>
                    </c:forEach>

                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                            <a href="${path }/user/getUserList.do?pageNum=${pageInfo.pageNum+1 }" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <li><a href="${path }/user/getUserList.do?pageNum=${pageInfo.pages}">末页</a></li>

                </ul>
            </nav>
        </div>
    </div>
</div> --%>
</body>
<script src="http://localhost:8080/LXKT/js/userManageJS.js"></script>
</html>