package com.service;

import java.util.List;

import javax.annotation.Resource;

import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.RoleHasPermissionKey;

public interface RolePerService {
	public Integer isRole(Integer userId);
	//赋予用户角色	
	public void giveRole(Integer userId,Integer roleId);
	//显示权限	
	public List<Permission> showPermission();
	
	public List<Role> showAllRole();
	
	public List<RoleHasPermissionKey> showRoleHasPer();
	
	public Permission getPermissionById(Integer perId);
	//根据用户ID判断角色	
	public Role getRoleByUserId(Integer userId);
	
	//由角色ID获取该角色权限集合
	public List<Permission>getPerByRoleId(Integer roleId);
	
	//由用户ID获取该用户权限集合
	public List<Permission>getPerByUserId(Integer userId);
	//添加权限
	public int addPermission(String perName,String perUrl);
	//权限更新
	public int updateByPrimaryKey(Permission per);
	//插入用户
	public int addRole(Role role);
	
	public void roleHasPermission(Integer roleId,Integer perId);
	

}
