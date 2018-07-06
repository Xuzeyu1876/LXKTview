package com.service;

import java.util.List;

import javax.annotation.Resource;

import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.RoleHasPermissionKey;

public interface RolePerService {
	public Integer isRole(Integer userId);
	//�����û���ɫ	
	public void giveRole(Integer userId,Integer roleId);
	//��ʾȨ��	
	public List<Permission> showPermission();
	
	public List<Role> showAllRole();
	
	public List<RoleHasPermissionKey> showRoleHasPer();
	
	public Permission getPermissionById(Integer perId);
	//�����û�ID�жϽ�ɫ	
	public Role getRoleByUserId(Integer userId);
	
	//�ɽ�ɫID��ȡ�ý�ɫȨ�޼���
	public List<Permission>getPerByRoleId(Integer roleId);
	
	//���û�ID��ȡ���û�Ȩ�޼���
	public List<Permission>getPerByUserId(Integer userId);
	//���Ȩ��
	public int addPermission(String perName,String perUrl);
	//Ȩ�޸���
	public int updateByPrimaryKey(Permission per);
	//�����û�
	public int addRole(Role role);
	
	public void roleHasPermission(Integer roleId,Integer perId);
	

}
