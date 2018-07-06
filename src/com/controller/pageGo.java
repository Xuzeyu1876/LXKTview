package com.controller;  
   



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller  
public class pageGo {
	@RequestMapping(value ="/sourceDownload")  
    public String sourceDownload() throws Exception{     	
	         return "sourceDownload";
    }  
    
	
    @RequestMapping(value = "permissionShow")  
    public String permissionShow() throws Exception{  
    	
	         return "permissionShow";
    }  
    
    @RequestMapping(value = "userShow")  
    public String userShow() throws Exception{  
    	
	         return "userShow";
    } 
    @RequestMapping(value = "/addUser")  
    public String addUser() throws Exception{  
    	
	         return "addUser";
    }  
    
    
    @RequestMapping(value = "courseShow")  
    public String courseShow() throws Exception{  
    	
	         return "courseShow";
    }  
    
    @RequestMapping(value = "/addCourse")  
    public String addCourse() throws Exception{     	
	         return "addCourse";
    } 
    
    @RequestMapping(value = "commentShow")  
    public String commentShow() throws Exception{     	
	         return "commentShow";
    } 
    
    @RequestMapping(value = "btest")  
    public String toIndex2() throws Exception{
    
    	
    	
    	
	         return "btest";
    }  
 
  

 

 
/* private ModelAndView pageList(	int pageSize,
		 						int pageNum,
		 						ModelAndView modelAndView,
		 						List list,
		 						PageInfo pageinfo,
		 						String viewName){
	 modelAndView.addObject("listCourse", listCourse);
     modelAndView.addObject("pageInfo", pageInfo);
     modelAndView.setViewName("courseShow");
	 
	return modelAndView;
	 
 }*/
}  