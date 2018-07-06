package com.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.User;
import com.service.RolePerService;

/*资料下载权限拦截器*/
public class sourceDownloadInt implements HandlerInterceptor{
	@Resource
	private RolePerService RPService;

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
		// TODO Auto-generated method stub
		//String url = request.getRequestURI();
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("USER_SESSION");
		//System.out.println(user.getUserMail());
		if(user!=null){
			if(RPService.isRole(user.getUserId())==2){
				System.out.println("happy!");
				return true;			
			}
			else{
				System.out.println("无资料下载权限！");
				response.sendRedirect("index.jsp");
				return false;				
			}	
			
		}
		else{
			System.out.println("请先登陆！");
			response.sendRedirect("login.jsp");
			return false;
			
		}
		

	}
	
}
