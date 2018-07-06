package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.mapper.RoleMapper;
import com.mapper.PermissionMapper;
import com.mapper.RoleHasPermissionMapper;
import com.mapper.UserHasRoleMapper;
import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.RoleHasPermissionKey;
import com.pojo.UserHasRoleKey;
import com.service.RolePerService;
@Service
public class RolePerServiceImpl implements RolePerService{
	@Resource
	private UserHasRoleMapper UHRMapper;
	@Resource
	private RoleMapper RoleMapper;
	@Resource
	private UserHasRoleKey  UHR;
	@Resource
	private RoleHasPermissionMapper  RHPMapper;
	@Resource
	private Permission  per;
	@Resource
	private PermissionMapper perMapper;

	@Override
	public Integer isRole(Integer userId){		
		return UHRMapper.isRole(userId).getRoleRoleId();
	}

	@Override
	public void giveRole(Integer userId, Integer roleId) {
		UHR.setUserUserId(userId);
		UHR.setRoleRoleId(roleId);		
		UHRMapper.insert(UHR);
		
		
	}

	@Override
	public List<Permission> showPermission() {
		return perMapper.showPermission();		
	}

	@Override
	public List<RoleHasPermissionKey> showRoleHasPer() {
		
		return RHPMapper.getAll();
	}

	@Override
	public Permission getPermissionById(Integer perId) {
	
		return perMapper.selectByPrimaryKey(perId);
	}

	@Override
	public List<Role> showAllRole() {
		
		return RoleMapper.showAllRole();
	}
	@Override
	public Role getRoleByUserId(Integer userId) {
		
		return RoleMapper.getRoleByUserID(userId);
	}

	@Override
	public List<Permission> getPerByRoleId(Integer roleId) {
		
		return perMapper.getPerByRoleId(roleId);
	}

	@Override
	public List<Permission> getPerByUserId(Integer userId) {
		int roleId=RoleMapper.getRoleByUserID(userId).getRoleId();		
		return perMapper.getPerByRoleId(roleId);
	}

	@Override
	public int addPermission(String perName, String perUrl) {
		per.setPerName(perName);
		per.setPerUrl(perUrl);		
		return perMapper.insertSelective(per);
	}

	@Override
	public int updateByPrimaryKey(Permission per) {
		
		return perMapper.updateByPrimaryKey(per);
	}

	@Override
	public int addRole(Role role) {		
		return RoleMapper.insertSelective(role);
	}

	@Override
	public void roleHasPermission(Integer roleId, Integer perId) {
		RHPMapper.insert1(roleId, perId);
		
		
	}


}
