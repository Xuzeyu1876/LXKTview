<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="http://localhost:8080/LXKT/css/bootstrap.min.css">
<script src="http://localhost:8080/LXKT/js/jquery.min.js"></script>
<script src="http://localhost:8080/LXKT/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/LXKT/css/homepage_style.css">
<link href="http://localhost:8080/LXKT/css/bootstrap.min.css " rel="stylesheet">
<script src="http://localhost:8080/LXKT/js/jquery.min.js "></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这不是测试</title>
</head>
<body>
<script type="text/javascript">
$(function(){
	changePage(1,0);
	
	
});

 
function viewCourse(couId){
	$.ajax({
		type:"GET",
		url:"./course/viewCourse.do?courseId="+couId,
		success:function(){
			top.location='course_list.jsp';
		}
	})
}
function changePage(pageNum,couSummary){  
    $.ajax({  
       type: "GET",  
       url: "./course/select_1.do?pageNum="+pageNum+"&couSummary="+couSummary,
  
       contentType: 'text/json,charset=utf-8',
       dataType: "json", 
       success: function(data){  
           console.log(data);  
            
           for(var i=0;i<data.list.length;i++){
        	   str += "<div class=\"box"+i+" course_default\" onclick=\"viewCourse("+data.list[i].couId+")\">";  
               str += "<div class></div>";  
               str += "<div class=\"text\" style=\"visibility:visible;\">";  
               str += "<p>"+data.list[i].couName+"</p>";
               str += "</div>";
               str += "</div>";
           }
           document.getElementById("x04").innerHTML=str;
           var strpage = "";
           strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage(1,0)\">首页</a></li>";
           var pre=data.pageNum-1;
           if(data.hasPreviousPage){
           strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+pre+",0)\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>";
           }
           var length=data.navigatepageNums.length+1;
           for(var i=1;i<length;i++){
           	if(i==data.pageNum){
           		strpage+="<li class=\"active\"><a href=\"javascript:void(0)\" onclick=\"changePage("+i+",\"C\")\">"+i+"</a></li>";
           	}else{
           		strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+i+",0)\">"+i+"</a></li>";
           	}
           }
           var next=data.pageNum+1;
           if(data.hasNextPage){
           	strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+next+",0)\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>";
           }
           strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+data.pages+",0)\">末页</a></li>";
           document.getElementById("pageshow").innerHTML=strpage;
      }  
    }); 
}
</script>
<jsp:include page="home.jsp"/>
<div class="container">
	<div id=x01 class="font_1">
		<ul class="nav nav-tabs nav-stacked">
				<li>
					 <a href="javascript:void(0)" onclick="changePage(1,0)">C/C++</a>
				</li>
				<li>
					 <a href="#">Windows编程</a>
				</li>
				<li>
					 <a href="#">Linux编程</a>
				</li>
				<li>
					 <a href="#">FFmpeg</a>
				</li>
				<li>
					 <a href="#">Opencv</a>
				</li>
				<li>
					 <a href="#">设计模式</a>
				</li>
				<li>
					 <a href="#">C++ Qt</a>
				</li>
				<li>
					 <a href="#">Android</a>
				</li>
				<li>
					 <a href="#">开发工具和SDK</a>
				</li>
			</ul>
	</div>
	<div id=x02>
		<div id="myCarousel" class="carousel slide">
				<!-- 轮播（Carousel）指标 -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>   
				<!-- 轮播（Carousel）项目 -->
				<div class="carousel-inner">
					<div class="item active">
						<img src="images/slide1.png" width="500px" alt="First slide">
					</div>
					<div class="item">
						<img src="images/slide2.png" width="500px" alt="Second slide">
					</div>
					<div class="item">
						<img src="images/slide3.png" width="500px" alt="Third slide">
					</div>
				</div>
				<!-- 轮播（Carousel）导航 -->
				<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
	</div>
	<div id=x03>
		<p>
		<span class="font_heading_1">课程库</span>
		</p>
	</div>
	<div id=x04></div>
	<div id=x15>
		<nav aria-lable="Page navigation">
        	<ul class="pagination" id="pageshow"></ul>
    	</nav>
    </div>
</div>
</body>
</html>