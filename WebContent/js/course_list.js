function showCourseList(courseId){  
    $.ajax({  
       type: "GET",  
       url: "./coursesource/select_2",
  
       contentType: 'text/json,charset=utf-8',
       dataType: "json",
       success: function(data){
    	   console.log(data);
    	   var str="";
    	   for(var i=0;i<data.length;i++){
    		  str +="<div class=\"course-list\">";
    		  str +="<div class=\"course-list-in\">";
    		  str +="<div class=\"course-list-index\">"+(i+1)+"</div>";
    		  str +="<div>"+"<a href=\"./course/getComment.do?pageNum=1\">"+data[i].souName+"</a></div>";
    		  str += "</div>";
              str += "</div>";
    	   }
    	   document.getElementById("c04").innerHTML=str;
       }
    })
}