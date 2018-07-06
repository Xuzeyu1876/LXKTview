$(function () {
    $('myform').bootstrapValidator({
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
              message: '邮箱地址不能为空'
            }
          }
        }
      }
    });
  });