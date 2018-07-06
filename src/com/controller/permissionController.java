package com.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pojo.Course;
import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.RoleHasPermissionKey;
import com.service.RolePerService;

@Controller
public class permissionController {

	@Resource
	private RoleHasPermissionKey RHP;
	@Resource
	private RolePerService RPSource;
	@Resource
	private Permission per;
	@RequestMapping(value = "/showPerByRole",produces="application/json; charset=utf-8")
	@ResponseBody
	  public  String showPerByRole(HttpSession session,String RoleId){
		List<Permission> AllPer=new ArrayList<Permission>();
		List<Permission> rolePer=new ArrayList<Permission>();
		AllPer=RPSource.showPermission();		
		rolePer=RPSource.getPerByRoleId(Integer.parseInt(RoleId));
	
		for(int i=0;i<rolePer.size();i++){
			for(int j=0;j<AllPer.size();j++){
				if(AllPer.get(j).getPerId()==rolePer.get(i).getPerId()){
					AllPer.get(j).setIsOwnByRole(1);					
				}
			}
					
		}		
	    return JSON.toJSONString(AllPer);
	  }
	
	@RequestMapping(value = "/addRole",produces="application/json; charset=utf-8")
	@ResponseBody
	  public  String addRole(HttpSession session,String roleName,String roleStatus,String perList) {
		//插入角色表
		Role role=new Role();
		role.setRoleName(roleName);
		role.setRoleStatus(roleStatus);
		RPSource.addRole(role);
		//插入角色权限关联表		
		for(int i=0;i<perList.length();i++){
			int perId=Integer.parseInt(perList.substring(i, i+1));	
			RPSource.roleHasPermission(role.getRoleId(),perId);						
		}		
	    return JSON.toJSONString("success");
	  }
	
	@RequestMapping(value = "/showPerInModal",produces="application/json; charset=utf-8")
	@ResponseBody
	  public  String showPerInModal(HttpSession session) {		
		List<Permission> PerUnit=new ArrayList<Permission>();	
		PerUnit=RPSource.showPermission();		
	    return JSON.toJSONString(PerUnit);
	  }
	
	@RequestMapping(value = "/showAllPermission",produces="application/json; charset=utf-8")
	@ResponseBody
	  public  String showAllPermission(HttpSession session) {	
		List<Permission> listPer=new ArrayList<Permission>();
		listPer=RPSource.showPermission();
		 PageInfo<Permission> pageInfo=new PageInfo<Permission>(listPer);
	     return JSON.toJSONString(pageInfo);	
		//session.setAttribute("permissionName", listUnit);
	    //return JSON.toJSONString(listPer);
	  }
	
	@RequestMapping(value = "/showAllRole",produces="application/json; charset=utf-8")
	@ResponseBody
	  public  String showAllRole(HttpSession session) {	
		List<Role> listRole=new ArrayList<Role>();
		listRole=RPSource.showAllRole();
		 PageInfo<Role> pageInfo=new PageInfo<Role>(listRole);
	     return JSON.toJSONString(pageInfo);	
		//session.setAttribute("permissionName", listUnit);
	    //return JSON.toJSONString(listPer);
	  }
	
	//添加评论
	@RequestMapping(value = "/addPermission",produces="application/json; charset=utf-8")
	@ResponseBody
	  public String addPermission(HttpSession session,String perName,String perUrl) {
		int status= RPSource.addPermission(perName, perUrl);
		if(status>0)
			return JSON.toJSONString("success");
		else
			return JSON.toJSONString("error");
	  }
	
	@RequestMapping(value = "/updatePermission",produces="application/json; charset=utf-8")
	@ResponseBody
	  public String updatePermission(HttpSession session,String perId,String perName,String perUrl,String perStatus) {
		per.setPerId(Integer.valueOf(perId));
		per.setPerName(perName);
		per.setPerUrl(perUrl);
		per.setPerStatus(perStatus); 
		int result=RPSource.updateByPrimaryKey(per);
		if(result>0)	
		return JSON.toJSONString("success");
		else
		return JSON.toJSONString("error");
	  }




}
