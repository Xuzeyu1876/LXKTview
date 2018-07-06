<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->  
<script src="http://localhost:8080/LXKT/js/jquery.min.js"></script>  
<script type="text/javascript" src="http://localhost:8080/LXKT/js/jquery.min.js"></script>
<script type="text/javascript" src="http://localhost:8080/LXKT/js/jquery-1.4.1.min.js"></script>
<script src="http://localhost:8080/LXKT/js/jquery.js"></script>
<script src="http://localhost:8080/LXKT/js/bootstrap.min.js"></script>
<script src="http://localhost:8080/LXKT/js/test.js"></script>
<link href="http://localhost:8080/LXKT/js/bootstrap.min.css" rel="stylesheet">
<head>
<style>
.center{text-align:center}
.comment{text-align:center}
.comment-list{left:50%;right: 50%;}
.face{width:50px;height:50px;background-color:blue;float:left; border-radius: 50%;-moz-border-radius: 50%;-webkit-border-radius: 50%;}
.con{width:500px;background-color:re;left:30px;float:left;position:relative}
.replycon{left:30px;float:lef;position:relative}
.box{width:550px;background-color:blac}
.postbut{position:absolute;width:80px;height:30px;left:500px;}
.text{position:absolute;}
.test{margin-left:20px}
.reply{margin-top:20px}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看所有用户</title>
<script type="text/javascript">  
var xmlHttp;
var replyid=-1;
var toUserId=1;
var reply_type=0;
var pagenum=1;
var path=getPath();
/* function creatXMLHttp(){
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else{
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
} */

function sendRequest(){
	creatXMLHttp();
	xmlHttp.onreadystatechange = postcomment;
	xmlHttp.open("GET",path+"/course/postComment.do?content="+$("#com_content_bottom").val(),true);
	xmlHttp.send(null);
}
function sendRepRequest(){
	creatXMLHttp();
	xmlHttp.onreadystatechange = postreply;
	xmlHttp.open("GET",path+"/course/postReply.do?content="+$("#com_content").val()+"&commentId="+replyid+"&toUserId="+toUserId+"&replyType="+reply_type,true);
	xmlHttp.send(null);
}
function postcomment(){
	if(xmlHttp.readyState == 4){
//		alert("提交评论成功！");
		document.getElementById("com_content_bottom").value="";
 		changePage(pagenum);

	}
}
function postreply(){
	if(xmlHttp.readyState == 4){
//		alert("提交评论成功！");
 		document.getElementById("com_content").value="";
 		changePage(pagenum);
	}
}
function reply(con_id){
	var str = "";
	str += "<div id=\"replypost\" class=\"test\"><textarea  cols=\"80\" rows=\"5\" id = \"com_content\"></textarea><button type=\"button\" id=\"comment_send1\" class=\"postbut\" onclick=\"sendRepRequest()\">提交评论</button></div>";
	if(replyid<0)
	document.getElementById("con_"+con_id).innerHTML+=str;
	else{
	$("div").remove(".test");
	document.getElementById("con_"+con_id).innerHTML+=str;
	}
	replyid=con_id;
	reply_type=0;
}
 function reply_in(to_user_id,con_id){
	reply_type=1;
	var str = "";
	var username=getusername(to_user_id);
	str += "<div id=\"replypost\" class=\"test\"><textarea  cols=\"80\" rows=\"5\" id = \"com_content\" placeholder=\"回复 @"+username+" ：\"></textarea><button type=\"button\" id=\"comment_send1\" class=\"postbut\" onclick=\"sendRepRequest()\">提交评论</button></div>";
 	if(replyid<0){
	document.getElementById("con_"+con_id).innerHTML+=str;
//	document.getElementById("com_content").value="回复  "+username+":";
	}
	else{
	$("div").remove(".test");
	document.getElementById("con_"+con_id).innerHTML+=str;
//	document.getElementById("com_content").value="回复  "+username+":";
	} 
	replyid=con_id;
	toUserId=to_user_id;
} 
function getusername(userId){
	var username="";
	$.ajax({  
	       type: "GET",  
	       url: path+"/course/getusername.do?userId="+userId,  
	       contentType: 'text/json,charset=utf-8',
	       dataType: "json",
	       async:false,
	       success: function(data){
	    	   username=data.username;
	       }
	       });
	return username;
}

$(function(){
	changePage(1);
});
function reply_com(commentId){
	 $.ajax({  
	       type: "GET",  
	       url: path+"/course/reply.do?commentId="+commentId,  
	       contentType: 'text/json,charset=utf-8',
	       dataType: "json",
	       success: function(data){  
	           console.log(data); 
	           if(data!=null){
	        	   for(var i=0;i<data.length;i++){
	        		   var username=getusername(data[i].fromUserId);
	        		   var unixTimestamp = new Date( data[i].replyTime ) ;
	             	  commonTime = unixTimestamp.toLocaleString();
	        		   var str = "";
	        		   str += "<div id=\"reply_item_"+data[i].commentReplyId+"\" class=\"reply\">";  
	                   str += "<div id=\"user_" + data[i].fromUserId + "\" class=\"face\"></div>";  
	                   str += "<div id=\"reply_con_"+data[i].commentReplyId+"\" class=\"replycon\">";
	                   str += "<span>"+username+":</span>";
	                   if(data[i].replyType=="0")
	                   str += "<font size=\"3px\"><p>"+data[i].replyContent+"</p><font>";
	                   else str += "<font size=\"3px\"><p><span style=\"font-weight:900 ;font-size:1.5px\">回复 @ "+getusername(data[i].toUserId)+" :</span>"+data[i].replyContent+"</p><font>";
	                   str += "<div id=\"info\"><font size=\"1px\" color=\"grey\">";
	                   str += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>"+commonTime+"</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                   str += "<a href=\"javascript:void(0)\"  onclick=\"reply_in("+data[i].fromUserId+","+data[i].commentId+")\">回复</a></div>";
	                   str += "</div></div></div>";
	                   document.getElementById("reply_box_"+data[i].commentId).innerHTML+=str;
	        	   }
	           }
	           
	       }
	 });
}
Date.prototype.toLocaleString = function() {
    return this.getFullYear() + "-" + (this.getMonth() + 1) + "-" + this.getDate() + " " + this.getHours() + ":" + this.getMinutes();
};
function changePage(pageNum){  
    $.ajax({  
       type: "GET",  
       url: path+"/course/change.do?pageNum="+pageNum,  
       contentType: 'text/json,charset=utf-8',
       dataType: "json",
       success: function(data){  
    	   pagenum=pageNum;
           console.log(data);  
           var str ="";
          for(var i=0; i < data.list.length; i++) { 
        	  var username=getusername(data.list[i].userId);
        	  var unixTimestamp = new Date( data.list[i].comTime ) ;
        	  commonTime = unixTimestamp.toLocaleString();
        	   str += "<div class=\"box\">";
               str += "<div id=\"item_"+data.list[i].commentId+"\">";  
               str += "<div id=\"user_" + data.list[i].userId + "\" class=\"face\"></div>";  
               str += "<div id=\"con_"+data.list[i].commentId+"\" class=\"con\">";
               str += "<p>"+username+":</p>";
               str += "<font size=\"3px\" ><p>"+data.list[i].comContent+"</p></font>";
               str += "<div id=\"info\"><font size=\"1px\" color=\"grey\">";
               str += "<span>"+commonTime+"</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
               str += "<a href=\"javascript:void(0)\"  onclick=\"reply("+data.list[i].commentId+")\">回复</a></font></div>";
               str += "<div id=\"reply_box_"+data.list[i].commentId+"\"></div></div></div></div>";
               str += "<HR style=\"FILTER: alpha(opacity=100,finishopacity=0,style=2)\" width=\"90%\" color=#987cb9 SIZE=3>";
               reply_com(data.list[i].commentId);
           }  
           document.getElementById("comment-list").innerHTML=str;
           var strpage = "";
           strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage(1)\">首页</a></li>";
           var pre=data.pageNum-1;
           if(data.hasPreviousPage){
           strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+pre+")\" aria-label=\"Previous\"><span aria-hidden=\"true\">&laquo;</span></a></li>";
           }
           var length=data.navigatepageNums.length+1;
           for(var i=1;i<length;i++){
           	if(i==data.pageNum){
           		strpage+="<li class=\"active\"><a href=\"javascript:void(0)\" onclick=\"changePage("+i+")\">"+i+"</a></li>";
           	}else{
           		strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+i+")\">"+i+"</a></li>";
           	}
           }
           var next=data.pageNum+1;
           if(data.hasNextPage){
           	strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+next+")\" aria-label=\"Next\"><span aria-hidden=\"true\">&raquo;</span></a></li>";
           }
           strpage+="<li><a href=\"javascript:void(0)\" onclick=\"changePage("+data.pages+")\">末页</a></li>";
           document.getElementById("pageshow").innerHTML=strpage;
           document.getElementById("pageinfo").innerHTML=" 当前"+data.pageNum+"页，总共"+data.pages+"页，总共"+data.total+"条记录";
       }  
    });  
      
}
</script>  
</head>

<body>
<jsp:include page="../../home.jsp"/>
<div style="text-align: center;">
<iframe width="800" height="600" src="https://ke.qq.com/webcourse/index.html#course_id=231577&amp;term_id=100273169&amp;taid=1464734172022937&amp;vid=a14198i8y2h"></iframe>
</div>
<div class="comment">
<div class="comment-send">
<textarea cols="80" rows="5" id = "com_content_bottom"></textarea>
<button type="button" id="comment_send1" onclick="sendRequest()">提交评论</button>
</div>
</div>
<div id="section">
<div class="container">
	<div class="row clearfix">
 <div  id = "comment-list" class="comment-list">
            </div></div>
 <div class="row">
        <div class="col-md-6" id="pageinfo">
        </div>
        <div class="col-md-6">
            <nav aria-lable="Page navigation">
                <ul class="pagination" id="pageshow">
                </ul>
            </nav>
        </div>
    </div>
</div>
</div>
</body>
</html>