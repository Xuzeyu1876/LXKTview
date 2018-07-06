package com.interceptor;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Permission;
import com.pojo.User;
import com.service.RolePerService;
import com.service.UserService;
public class myInfoInterceptor implements HandlerInterceptor {
	@Resource
	private RolePerService RPService;
	@Resource
	private UserService userService;
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String url = request.getRequestURI();
		HttpSession session=request.getSession();		
		User user = (User) session.getAttribute("USER_SESSION");
		List<Permission> per=(List<Permission>) session.getAttribute("PERMISSION");
		
		if(user!=null){
		//�Ƿ�ӵ����������Ȩ��
		if(url.indexOf("/sourceDownload")>0){
			if(userService.ownPermission("/sourceDownload", per)){
				System.out.println("***********");
				return true;						
			}
			else{
				System.out.println("����������Ȩ�ޣ�");
				response.sendRedirect("index.jsp");
				return false;					
			}							
		} 
		//��������չ��������ԱΪ��̨���������û�Ϊ������Ϣ
		if(url.indexOf("/showMyPage")>0){
			System.out.println("--------���سɹ���---------");
			if(userService.ownPermission("/management", per)){
				System.out.println("--------����Ա�����̨����---------");
				response.sendRedirect("../btest.jsp");
				return false;						
			}
			else{
				if(userService.ownPermission("/showMyinfo", per)){
					System.out.println("--------��ͨ�û������̨����---------");
				return true;	}				
			}							
		} 
		System.out.println("δƥ�䵽��·����");
		return false;
		}
		
	else{
		System.out.println("���ȵ�½��");
		response.sendRedirect("login.jsp");
		return false;		
	}
						
			
		

	
		
		
	}

}
