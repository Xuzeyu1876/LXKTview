package com.controller;  
   
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import java.util.List;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.*;
import com.pojo.*;
import com.service.CommentReplyService;
import com.service.CommentService;
import com.service.courseService;
import com.service.CourseSourceService;
import com.service.RolePerService;
import com.service.UserService;
import com.sendMail.*;
@Controller  
public class test {   

	@Resource(name="userService")
    private UserService userService;
	@Resource
	private CommentService commentService;
	@Resource
	private CommentReplyService commentReplyService;
	@Resource
	private CourseSourceService coursesourceService;
	@Resource
	private courseService courseService;
	@Resource
	private RolePerService  RPService;


	@RequestMapping(value = "/course/select_1",produces="application/json; charset=utf-8")
	public @ResponseBody String ShowCourse(HttpServletRequest request,HttpServletResponse response,int pageNum,String couSummary) throws IOException{	
	    int pageSize=10; 
		PageHelper.startPage(pageNum,pageSize);//当前页，页面大小
	     //紧跟着的第一个select方法会被分页 
	     List<Course> listCourse=courseService.showCourse(couSummary);
	     PageInfo<Course> pageInfo=new PageInfo<Course>(listCourse);
	     return JSON.toJSONString(pageInfo);
	 }
	@RequestMapping(value = "/coursesource/select_2",produces="application/json; charset=utf-8")
	public @ResponseBody String showCourseSource(HttpServletRequest request,HttpServletResponse response){
		HttpSession session = request.getSession();
		int courseId =(Integer)session.getAttribute("COUID");
		List<CourseSource> listCourseSource=coursesourceService.showCourseSource(courseId);
		System.out.println(listCourseSource.toString());
		return JSON.toJSONString(listCourseSource);
	}
 
	@RequestMapping(value = "/course/viewCourse",produces="application/json; charset=utf-8")
	public @ResponseBody void viewCourse(HttpServletRequest request,HttpServletResponse response,int courseId){
		//List<CourseSource> listCourseSource=coursesourceService.showCourseSource(courseId);
		HttpSession session = request.getSession();
		System.out.println("*****************"+courseId);
		session.setAttribute("COUID", courseId);
	}
	
 @RequestMapping(value="/user/isLogin",produces="application/json; charset=utf-8")
 public @ResponseBody String isLogin(HttpServletRequest request, HttpServletResponse response){
	 HttpSession session = request.getSession();
	 User user=new User();
	 user = (User)session.getAttribute("USER_SESSION");
	 session.setAttribute("PAGE", "login.jsp");
	 return JSON.toJSONString(user);
 }
 
 @RequestMapping(value="/user/register",produces="application/json; charset=utf-8")
 public @ResponseBody String register(HttpServletRequest request, HttpServletResponse response,String userMail,String name,String password,String nums) throws UnsupportedEncodingException{
	 HttpSession session = request.getSession();
	 request.setCharacterEncoding("utf-8");
	 String num = session.getAttribute("nums").toString();
	 System.out.println(""+num);
	 System.out.println(""+nums);
	 String is_equal;
	 if(nums.equals(num)){		 
		 is_equal="success";
	     User user=new User();
		 user.setUsername(name);
		 user.setPassword(password);
		 user.setUserMail(userMail);
		 user.setCreateTime(new Date());
		 userService.insert(user);
		 session.setAttribute("USER_SESSION", user);
	 }
	 else 
		 is_equal="false";
	 return JSON.toJSONString(is_equal);
 }
 @RequestMapping(value= "/user/login")
 public @ResponseBody void login(HttpServletRequest request, HttpServletResponse response)throws Exception
 {
	 HttpSession session = request.getSession();
	 String userMail=(String)request.getParameter("userMail");
	 String password=(String)request.getParameter("password");
	// session.setAttribute("PAGE", "main.jsp");
	 User user=userService.findUser(userMail,password);
	 if(user!=null){
		 boolean is_login=true;
		 //获取用户权限集合	
		 List<Permission> per=RPService.getPerByUserId(user.getUserId());
		 session.setAttribute("is_login", is_login);
		 session.setAttribute("USER_SESSION",user);
		 session.setAttribute("PERMISSION",per);		 
		 response.sendRedirect("../index.jsp");
		 }
	 else{ 
	
	 response.sendRedirect("../index.jsp");
	 }

		

 }
 
/*展开个人中心*/
 @RequestMapping(value= "/user/showMyPage")
 public @ResponseBody void  showMyPage(HttpServletRequest request, HttpServletResponse response)throws Exception
 {
	System.out.println("进入个人中心！");
 }
 
 @RequestMapping(value= "/user/loginOut")
 public @ResponseBody void  loginOut(HttpServletRequest request, HttpServletResponse response)throws Exception
 {
	 HttpSession session = request.getSession();
		 session.removeAttribute("USER_SESSION");
	//	 session.setAttribute("PAGE", "main.jsp");
		 response.sendRedirect("../index.jsp");
 }
 
 @RequestMapping(value= "/user/selectPage")
 public  @ResponseBody String  selectPage(HttpServletRequest request, HttpServletResponse response)throws Exception
 { 
	 HttpSession session = request.getSession();
	 return JSON.toJSONString(session.getAttribute("PAGE"));
 }
 
/* @RequestMapping("/user/getUserList")
 public ModelAndView ShowComment(ModelAndView modelAndView,int pageNum){	 
     int pageSize=10;
     PageHelper.startPage(pageNum, pageSize);//当前页，页面大小
     //紧跟着的第一个select方法会被分页 
     List<User> listUser=userService.getUser();
     PageInfo<User> pageInfo=new PageInfo<User>(listUser);
     modelAndView.addObject("listUser", listUser);
     modelAndView.addObject("pageInfo", pageInfo);
     modelAndView.setViewName("usershow");
     return modelAndView;
 }*/
 
 @RequestMapping("/course/getComment")
 public ModelAndView ShowCourse(ModelAndView modelAndView,int pageNum){
	 int pageSize=10;
     PageHelper.startPage(pageNum, pageSize);//当前页，页面大小
     //紧跟着的第一个select方法会被分页 
     List<Comment> listComment=commentService.getComment();
     PageInfo<Comment> pageInfo=new PageInfo<Comment>(listComment);
  //   modelAndView.addObject("listUser", listComment);
     modelAndView.addObject("pageInfo", pageInfo);
     modelAndView.setViewName("viewCourse");
     return modelAndView;
 }
 @RequestMapping(value="/course/change",produces="application/json; charset=utf-8")
 public @ResponseBody String change(HttpServletRequest request, HttpServletResponse response,int pageNum) throws UnsupportedEncodingException{
	 int pageSize=10;
     PageHelper.startPage(pageNum, pageSize);//当前页，页面大小
     //紧跟着的第一个select方法会被分页 
     List<Comment> listComment=commentService.getComment();
     PageInfo<Comment> pageInfo=new PageInfo<Comment>(listComment);
     return JSON.toJSONString(pageInfo);
 }
 
 @RequestMapping(value="/course/reply",produces="application/json; charset=utf-8")
 public @ResponseBody String reply(HttpServletRequest request, HttpServletResponse response,int commentId) throws UnsupportedEncodingException{
     List<CommentReply> listComment=commentReplyService.getCommentReply(commentId);
     return JSON.toJSONString(listComment);
 }
 
 @RequestMapping(value="/course/getusername",produces="application/json; charset=utf-8")
 public @ResponseBody String getusername(int userId) throws UnsupportedEncodingException{
    User user = userService.getUserById(userId);
     return JSON.toJSONString(user);
 }
 
 @RequestMapping("/course/postComment")
 public @ResponseBody void  postComment(HttpServletRequest request, HttpServletResponse response,String content) throws UnsupportedEncodingException{
	HttpSession session=request.getSession();
	request.setCharacterEncoding("utf-8");
	User user = (User)session.getAttribute("USER_SESSION");
	Date day=new Date();    
//	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	String time = df.format(day);
	Comment comment=new Comment();
	comment.setComContent(content);
	comment.setComTime(day);
	comment.setUserId(user.getUserId());
	comment.setCourseId(1);
	commentService.insert(comment);
 }
 
 @RequestMapping("/course/postReply")
 public @ResponseBody void  postReply(HttpServletRequest request, HttpServletResponse response,String content,int toUserId,int commentId,int replyType) throws UnsupportedEncodingException{
	HttpSession session=request.getSession();
	request.setCharacterEncoding("utf-8");
	User user = (User)session.getAttribute("USER_SESSION");
	Date day=new Date();    
//	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	String time = df.format(day);
	CommentReply commentReply=new CommentReply();
	commentReply.setCommentId(commentId);
	commentReply.setFromUserId(user.getUserId());
	commentReply.setReplyType(replyType);
	commentReply.setToUserId(toUserId);
	commentReply.setReplyTime(day);
	commentReply.setReplyContent(content);
	commentReplyService.insert(commentReply);
 }
 
 @RequestMapping("/user/sendMail")
 public @ResponseBody void mail(HttpServletRequest request, HttpServletResponse response,String mail) throws Exception{
	 int nums=(int)((Math.random()*9+1)*1000); 
	 String num=nums+"";
	 HttpSession session=request.getSession();
	 session.setAttribute("nums", nums);
	 Main main=new Main();
	 main.send(num, mail);
 }
}  