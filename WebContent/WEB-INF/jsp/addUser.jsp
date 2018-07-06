<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="http://localhost:8080/LXKT/js/jquery.js"></script>
<script type="text/javascript" src="http://localhost:8080/LXKT/js/jquery.min.js"></script>
<script type="text/javascript" src="http://localhost:8080/LXKT/js/jquery-1.4.1.min.js"></script>
<script src="http://localhost:8080/LXKT/js/jquery.min.js"></script>  
<script src="http://localhost:8080/LXKT/js/bootstrap.min.js"></script>
<script src="http://localhost:8080/LXKT/js/test.js"></script>
<style>
.main{
    text-align: center; /*让div内部文字居中*/
    border-radius: 20px;
    width: 300px;
    height: 350px;
    margin: auto;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
}
.grey{background-color:grey}
.blue{background-color:#23b8ff}
.error{color:red;float:left;font-size:10px}
body{background-image:/image/register_back.jpg; 
background-repeat:no-repeat;background-position:center} 
.num{width: 120px;height:50px;border-radius: 5px;position:absolute;left:0px;border:0.5px solid grey;}
.text{ width: 400px;height:50px;border-radius: 5px;border:0.5px solid grey;}
.but{width: 270px;height:50px;border-radius: 5px;position:absolute;left:130px;font-size:20px;color:#fff;}
.register{width: 400px;height:50px;border-radius: 5px;font-size:30px;color:#fff;background-color:#3399CC}
</style>
<script>
var path = getPath();
$(document).ready(function(){
    $("#mail").focus(function(){
        //$("#show").html("<input type=\"text\" class=\"num\" id=\"mailNum\" placeholder=\"邮箱验证码\"></input><input type=\"button\" class=\"but blue\" value=\"发送邮箱验证码\" onclick=\"sendmail()\"></input><br><br><br>");
    });
    $("input").blur(function(){
    	if($("#mail").val()==""){
      	  $("#show").html("");
      	 $("#errorMail").html("");}
    	else {
    		var mail=$("#mail").val();
    		var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
    		if(!reg.test(mail)){
    			$("#errorMail").html("邮箱格式错误！");
    		}
    	}
    });
    $("#name").blur(function(){
    	if($("#name").val()=="")
    		$("#errorName").html("昵称不能为空");
    })
     $("#name").focus(function(){
    		$("#errorName").html("");
    })
     $("#password").blur(function(){
    	if($("#password").val()=="")
    		$("#errorPassword").html("密码不能为空");
    })
	$("#password").focus(function(){
    		$("#errorPassword").html("");
    })
     $("#password1").blur(function(){
    	if($("#password").val()!=$("#password1").val())
    		$("#errorPassword1").html("两次密码不一致");
    })
    $("#password1").focus(function(){
    		$("#errorPassword1").html("");
    })
});

function register(){
	if($("#name").val()!=""&&$("#password").val()!=""&&$("password").val()==$("password1").val()){
		var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
	//	var nums = ""+$(".num").val();
		if(reg.test($("#mail").val())){
			$.ajax({
				type:"GET",
				contentType: 'text/json,charset=utf-8',
			    dataType: "json",
				url:path+"/user/register?name="+$("#name").val()+"&password="+$("#password").val()+"&nums="+$(".num").val()+"&userMail="+$("#mail").val(),
				success:function(data){
					if(data=="success"){
						top.location='index.jsp';
					}
					else {
						alert("！"+data);
					}
				}		
			});
		}
		else alert("aaaaa ");	
	}
	else alert("emmm");	
}

/* function sendmail(){
	$.ajax({
		type:"GET",
		url:path+"/user/sendMail?mail="+$("#mail").val(),
		success: function(){
			$(".but").attr('disabled',true);
			$(".but").removeClass("blue");
		}
	})
} */
</script>
<head>
<title>Insert title here</title>
</head>
<body >

<!-- <div class="main">
<label for="exampleInputEmail1">用户名</label><input type="text" class="text"  id="name"></input><br><br>
<p id="errorName" class="error"></p><br>
<label for="exampleInputEmail1">密码</label><input type="password" class="text" id="password"></input><br><br>
<p id="errorPassword" class="error"></p><br>
<label for="exampleInputEmail1">再次输入密码</label><input type="password" class="text"  id="password1"></input><br><br>
<p id="errorPassword1" class="error"></p><br>
<label for="exampleInputEmail1">邮箱地址</label><input type="text" class="text" id="mail" ></input><br>
<p id="errorMail" class="error"></p><br>
<div id="show"></div>
<div>
<input type="button"  class="register" value="立即注册" onclick="register()"></input></div>
</div> -->
<div class="container">
	<div class="row clearfix">
		<div class="col-md-2 column">
		</div>
		<div class="col-md-6 column">
			<form id="myform"class="form-horizontal" action="${pageContext.request.contextPath}/user/addUserByManager" method="post">
				<div class="form-group">
					 <label >用户名</label><input type="text" class="form-control"  id="name" name="name"></input>
						<p id="errorName" class="error"></p><br>
				</div>
				<div class="form-group">
					 <label >邮箱地址</label><input type="text" class="form-control" id="mail" name="mail" ></input>
					<p id="errorMail" class="error"></p><br>
				</div>
				<div class="form-group">
					 <label >密码</label><input type="password" class="form-control" id="password" name="password"></input>
					<p id="errorPassword" class="error"></p><br>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">再次输入密码</label><input type="password" class="form-control"  id="password1"></input>
					<p id="errorPassword1" class="error"></p><br>
				</div>
			<div class="radio">
   				<label><input type="radio" name="optionsRadios" id="optionsRadios1" value="普通用户" checked>普通用户</label>
			   	<label><input type="radio" name="optionsRadios" id="optionsRadios2" value="管理员" >管理员</label>
			
			</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
</body>
</html>