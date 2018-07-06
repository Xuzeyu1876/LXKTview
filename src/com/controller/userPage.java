package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Permission;
import com.pojo.User;
import com.pojo.combinePojo;
import com.service.RolePerService;
import com.service.UserService;
@Controller
public class userPage {
	@Resource
    private User user;
	@Resource
    private UserService userService;
	@Resource
    private RolePerService RPService;
	private List<User> listUser=null;
	@RequestMapping(value="/user/addUserByManager",method=RequestMethod.POST)
	 public String addUserByManager(@RequestParam("name") String name, 
	    					@RequestParam("mail") String mail,
	    					@RequestParam("password") String password,
	    					@RequestParam("optionsRadios") String userType
	    					){ 
			 user.setUsername(name);
			 user.setPassword(password);
			 user.setUserMail(mail);
			 user.setCreateTime(new Date());
			 user.setIsValidate(0);
			 user.setUserStatus(0);			 			 
			userService.insert(user);
			 int userId=user.getUserId();
			 if(userType.equals("管理员"))
				 RPService.giveRole(userId, 2);
			 if(userType.equals("普通用户"))
				 RPService.giveRole(userId, 1);
			 System.out.println(userType);			 
			 return "userShow";
	 }
	@RequestMapping(value = "/user/delete")  
	    public ModelAndView userDelete(ModelAndView modelAndView,int userId){  
		        userService.deleteUser(userId,1);		       
		        return modelAndView;
	    }  
	//按用户名查找    
	 @RequestMapping(value = "/user/select",method=RequestMethod.POST)    
	 public ModelAndView bay(@RequestParam("username") String userName,ModelAndView modelAndView)
	 {
		 listUser=userService.selectUser(userName);
		 System.out.println(""+userName);
		 if(listUser.size()==0){
			 System.out.println("用户不存在a！");		 
		 }
		 int id=listUser.get(0).getUserId();
		
		// userService.getRoleByUserId(id);
		 List<Permission>per=RPService.getPerByUserId(id);
		 for(int i=0;i<per.size();i++){
			 System.out.println(per.get(i).getPerUrl());			 
		 }
		 
		 if(RPService.getRoleByUserId(id)==null)
			 System.out.println("wwww!");
		 else{
			 System.out.println(RPService.getRoleByUserId(id).getRoleName());
			 
		 }
			 
	
		 
		 
		 int pageSize=6;
		 PageHelper.startPage(1, pageSize);//当前页，页面大小
		 PageInfo<User> pageInfo=new PageInfo<User>(listUser);
	     modelAndView.addObject("listUser", listUser);
	     modelAndView.addObject("pageInfo", pageInfo);
	     modelAndView.setViewName("userShow");
	     return modelAndView;
	 }
	 
	 //表格显示用户信息
	 @RequestMapping(value="/user/getUserList",produces="application/json; charset=utf-8")
	 @ResponseBody
	 public String getUserList(HttpSession session,int pageNum){
		 int pageSize=2; 
			PageHelper.startPage(pageNum,pageSize);//当前页，页面大小
	   /*  int pageSize=6;
	    PageHelper.startPage(pageNum, pageSize);*///当前页，页面大小
	     //紧跟着的第一个select方法会被分页 
	    //未注销账户
/*	    if(userStatus==0){
	    		    	
	    }
	    //已注销账户
	    if(userStatus==1){
	    	listUser=userService.getUser(1);
	    	
	    }	*/
	    List<combinePojo>listUser=new ArrayList<combinePojo>();
	    listUser=userService.getUser();
	    PageInfo<combinePojo> pageInfo=new PageInfo<combinePojo>(listUser);
	     return JSON.toJSONString(pageInfo);	
	    /* PageInfo<combinePojo> pageInfo=new PageInfo<combinePojo>(listUser);
	     modelAndView.addObject("listUser", listUser);	     
	     modelAndView.addObject("pageInfo", pageInfo);
	     modelAndView.setViewName("userShow");*/
	    
	 }
	 @RequestMapping(value="/user/getUserList2",produces="application/json; charset=utf-8")
	 @ResponseBody
	 public String getUserList2(HttpSession session){
	   /*  int pageSize=6;
	    PageHelper.startPage(pageNum, pageSize);*///当前页，页面大小
	     //紧跟着的第一个select方法会被分页 
	    //未注销账户
/*	    if(userStatus==0){
	    		    	
	    }
	    //已注销账户
	    if(userStatus==1){
	    	listUser=userService.getUser(1);
	    	
	    }	*/
	    List<User>listUser=new ArrayList<User>();
	    listUser=userService.showUser();
	    PageInfo<User> pageInfo=new PageInfo<User>(listUser);
	     return JSON.toJSONString(pageInfo);	
	    /* PageInfo<combinePojo> pageInfo=new PageInfo<combinePojo>(listUser);
	     modelAndView.addObject("listUser", listUser);	     
	     modelAndView.addObject("pageInfo", pageInfo);
	     modelAndView.setViewName("userShow");*/
	    
	 }
	 
	 

}
