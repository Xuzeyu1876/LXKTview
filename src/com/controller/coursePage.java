package com.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Course;
import com.pojo.WebsiteResources;
import com.service.courseService;

@Controller
public class coursePage {
   @Resource
	private Course course;
   @Resource
	private courseService courseService;
	/*@Autowired
	private WebsiteResources  Wsource;*/
    
	 @RequestMapping(value="/getCourseList")
	 public ModelAndView getCourseList(ModelAndView modelAndView,int pageNum){
	     int pageSize=6;
	    PageHelper.startPage(pageNum, pageSize);//��ǰҳ��ҳ���С
	     //�����ŵĵ�һ��select�����ᱻ��ҳ 
	     List<Course> listCourse=courseService.getAllcourse();
	     PageInfo<Course> pageInfo=new PageInfo<Course>(listCourse);
	     modelAndView.addObject("listCourse", listCourse);
	     modelAndView.addObject("pageInfo", pageInfo);
	     modelAndView.setViewName("courseShow");
	     return modelAndView;
	 }
	 
	 @RequestMapping(value="/addCourse/insert", method=RequestMethod.POST)  
	    private String doSave(@RequestParam("coursename") String courseName, 
	    		@RequestParam("courseSummary") String courseSummary,
	    		@RequestParam("courseImage") String courseImage,
	    		//@RequestParam("courselink") String courselink, //�γ���Դ����
	   		
	    		HttpSession session){
	    		Date date=new Date(); //��ȡ����
	    		course.setCouName(courseName);
	    		course.setCouSummary(courseSummary);
	    		course.setCouImage(courseImage);    		
	    		course.setCouLinetime(date);
	    		course.setCouUpdatetime(date);
	    		courseService.insertSelective(course);
	    		//�γ���Դ
	    	/*	Wsource.setCourseId(course.getCouId());
	    		Wsource.setRcUrl(courselink);
	    	
	    		courseService.addSource(Wsource);*/
	        return "yee";  
	    }  

}
