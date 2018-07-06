package com.controller;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Comment;
import com.pojo.Course;
import com.pojo.combinePojo;
import com.service.CommentService;
import com.service.courseService;
import com.alibaba.fastjson.JSON;



@Controller

public class commentPage {
@Resource
    private CommentService commentService;
@Resource
    private courseService courseService;
	private List<Course> courseUnit=null;
	
	@RequestMapping(value = "/showUnit")
	@ResponseBody
	  public  String ajaxDatas(HttpSession session) {
		List<String> listUnit=new ArrayList<String>();
		courseUnit=courseService.getAllcourse();
		for(int i=0;i<courseUnit.size();i++){
			listUnit.add(courseUnit.get(i).getCouName());			
		}
		session.setAttribute("coursename", listUnit);
	    return JSON.toJSONString(listUnit);
	  }
	
	 @RequestMapping(value="/getCommentList")
	 public ModelAndView getCommentList(ModelAndView modelAndView,int pageNum){
	     int pageSize=8;
	    PageHelper.startPage(pageNum, pageSize);//当前页，页面大小
	     //紧跟着的第一个select方法会被分页 
	     List<Comment> listComment=commentService.getComment();
	     PageInfo<Comment> pageInfo=new PageInfo<Comment>(listComment);
	     modelAndView.addObject("listComment", listComment);
	     modelAndView.addObject("pageInfo", pageInfo);
	     modelAndView.setViewName("commentShow");
	     return modelAndView;
	 }
	 
	 @RequestMapping(value="/comment/select")
	 public ModelAndView commentSelect(	@RequestParam("username") String userName,
										@RequestParam("coursename") int courseName,										
			 							ModelAndView modelAndView,
			 							HttpSession session
			 							){
		List<String> listcouName=(List<String>) session.getAttribute("coursename");
	    PageHelper.startPage(1, 8);//当前页，页面大小
	     //紧跟着的第一个select方法会被分页 
	     List<combinePojo> listUnit=commentService.selectComment(userName,listcouName.get(courseName));
	     PageInfo<combinePojo> pageInfo=new PageInfo<combinePojo>(listUnit);
	     modelAndView.addObject("listUnit", listUnit);
	     modelAndView.addObject("pageInfo", pageInfo);
	     modelAndView.setViewName("commentShow");
	     return modelAndView;
		 
	 }
	 
	 

}
