<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程上线</title>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrapValidator.css" rel="stylesheet" />

</head>
<body>

<div class="container">
  <form id="myform"class="form-horizontal" action="${pageContext.request.contextPath}/addCourse/insert" method="post">
    <fieldset>
      <div id="legend" class="">
        <legend class=""><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">addCouser</font></font></legend>
      </div>
    <div class="control-group">

          <!-- Text input-->
          <label class="control-label" for="input01"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">课程名称</font></font></label>
          <div class="controls">
            <input type="text"  name="coursename" placeholder="请输入课程名称" class="input-xlarge">
            <p class="help-block"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">支持帮助文字</font></font></font></font></p>
          </div>
        </div>

    

    

    <div class="control-group">

          <!-- Textarea -->
          <label class="control-label">课程简介</label>
          <div class="controls">
            <div class="textarea">
                  <textarea type="" class="" name="courseSummary"> </textarea>
            </div>
          </div>
        </div>

    <div class="control-group">
          <label class="control-label">课程图片</label>

          <!-- File Upload -->
          <div class="controls">
            <input class="input-file" id="fileInput" type="file" name="courseImage">
          </div>
        </div>

    <div class="control-group">
          <label class="control-label">课程来源</label>
          <div class="controls">
      <!-- Multiple Radios -->
      <label class="radio" name="coursefrom">
        <input type="radio" value="老夏课堂" name="coursegroup" checked="checked">
        老夏课堂
      </label>
      <label class="radio">
        <input type="radio" value="腾讯课堂" name="coursegroup">
        腾讯课堂
      </label>
      <label class="radio">
        <input type="radio" value="慕课" name="coursegroup">
        慕课
      </label>
  </div>
 <!--  <div class="control-group">
  	  <label class="control-label" for="input01"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">课程资源链接</font></font></label>
  	  <div class="controls">
  	 	<input type="text"  name="courselink" placeholder="请输入课程资源链接" class="input-xlarge">
  	 	
  	 </div>
  </div> -->

  </div>

    

    <div class="control-group">
          <label class="control-label"></label>

          <!-- Button -->
          <div class="controls">
            <button type="submit"class="btn btn-primary"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">提交</font></font></font></font></button>
          </div>
        </div>

    </fieldset>
  </form>
  </div>
<!-- <script type="text/javascript">
$(function () {
    $("#myform").bootstrapValidator({
　　　　　 live: 'disabled',//验证时机，enabled是内容有变化就验证（默认），disabled和submitted是提交再验证　　　
    	message: 'This value is not valid',
      　feedbackIcons: {
        　　　　　　　　valid: 'glyphicon glyphicon-ok',
        　　　　　　　　invalid: 'glyphicon glyphicon-remove',
        　　　　　　　　validating: 'glyphicon glyphicon-refresh'
      　　　　　　　　  },
      fields: {
    	  coursename: {
          message: '用户名验证失败',
          validators: {
            notEmpty: {
              message: '用户名不能为空'
            }
          }
        },
        courseSummary: {
          validators: {
            notEmpty: {
              message: '内容不能为空'
            }
          }
        }
      }
    });
    $("#btn-test").click(function () {//非submit按钮点击后进行验证，如果是submit则无需此句直接验证  
        $("#myform").bootstrapValidator('validate');//提交验证  
        if ($("#myform").data('bootstrapValidator').isValid()) {//获取验证结果，如果成功，执行下面代码  
            alert("yes");//验证成功后的操作，如ajax  
        }  
    });  
    
  });
  </script> -->
<script src="https://code.jquery.com/jquery.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="bootstrapValidator.js"></script>

</body>
</html>