<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看所有评论</title>

<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.jquery.com/jquery.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>


</head>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<script type="text/javascript">
 $(function() {	
	 $.ajax({  
	        type : "GET",  
	        url : "./showUnit",
	        dataType : 'json',  
	        success : function(datas) {//返回list数据并循环获取  	        	
	        	var select = $("#slpk");
	            for (var i = 0; i < datas.length; i++) {  
	            	select.append("<option value='"+i+"'>"  
                  + datas[i] + "</option>");   
	            }  
	             $("#slpk").selectpicker('val','');  
	            $("#slpk").selectpicker('refresh');   
	        }  
	    });	
   	$("#slpk").selectpicker({
		noneSelectedText : '请选择'//默认显示内容
	}); 
                  //数据赋值
//	var select = $("#slpk");
	
            

            //初始化刷新数据
  	$(window).on('load', function() {
		$("#slpk").selectpicker('refresh');
	});
     
	});  

</script>
<body>
<jsp:include page="../../home.jsp"/>
<div id="section">
<h3>评论区信息</h3>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-8 column">
			<form class="form-horizontal" role="form"  action="${path }/comment/select.do" method="post"  >
				<div class="form-group">
					 <label for="inputname" class="col-sm-2 control-label">用户名</label>					
					<div class="col-sm-4">
						<input type="text" class="form-control" name="username"/>
					</div>	
					<label for="inputname" class="col-sm-2 control-label">课程名</label>				
					<div class="col-md-4 column">
						<select id="slpk" class="selectpicker" data-live-search="true" name="coursename" >							
    						</select> 	    						
    				</div>   				
    				<div class="col-md-4 column">
						<button type="btn btn-primary" class="btn btn-default" onclick="showcomment">查找</button>
					</div>				
				</div>	
			</form>   							
		</div>
		</div>
		</div>
		
    					
 <table class="table table-honver">
                <tr>
                    <th>id</th>
                    <th>评论人</th>                   
                    <th>所评课程</th>
                    <th>评论内容</th>
                    <th>评论时间</th>
                  
                </tr>
                <c:forEach items="${listUnit}" var="Unit">
                <tr>
                    <td>${Unit.commentId }</td>
                    <td>${Unit.username }</td>
                    <td>${Unit.couName}</td>
                    <td>${Unit.comContent}</td>
                    <td>${Unit.comTime}</td>
                    
                    <td><button class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-pencil"></span>查看</button></td>
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

                    <li><a href="${path }/getCommentList.do?pageNum=1">首页</a></li>

                    <c:if test="${pageInfo.hasPreviousPage  }">
                        <li>
                            <a href="${path }/getCommentList.do?pageNum=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums  }" var="page">
                        <c:if test="${page==pageInfo.pageNum }">
                            <li class="active"><a href="${path }/getCommentList.do?pageNum=${page}">${page}</a></li>
                        </c:if>
                        <c:if test="${page!=pageInfo.pageNum }">
                            <li><a href="${path }/getCommentList.do?pageNum=${page}">${page}</a></li>
                        </c:if>
                    </c:forEach>

                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                            <a href="${path }/getCommentList.do?pageNum=${pageInfo.pageNum+1 }" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <li><a href="${path }/getCommentList.do?pageNum=${pageInfo.pages}">末页</a></li>

                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
function showcomment(){
	$.ajax({  
        type : "GET",  
        url : "./comment/select",
        dataType : 'json',  
        success : function(datas) {//返回list数据并循环获取  	        	
        	var select = $("#slpk");
            for (var i = 0; i < datas.length; i++) {  
            	select.append("<option value='"+i+"'>"  
                  + datas[i] + "</option>");   
            }  
            $("#slpk").selectpicker('val','');  
            $("#slpk").selectpicker('refresh');  
        }  
    });	
}		
	</script>

</html>