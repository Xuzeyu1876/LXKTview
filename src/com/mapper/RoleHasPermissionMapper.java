package com.mapper;

import com.pojo.RoleHasPermissionExample;
import com.pojo.RoleHasPermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleHasPermissionMapper {
    long countByExample(RoleHasPermissionExample example);

    int deleteByExample(RoleHasPermissionExample example);

    int deleteByPrimaryKey(RoleHasPermissionKey key);

    int insert(RoleHasPermissionKey record);

    int insertSelective(RoleHasPermissionKey record);

    List<RoleHasPermissionKey> selectByExample(RoleHasPermissionExample example);

    int updateByExampleSelective(@Param("record") RoleHasPermissionKey record, @Param("example") RoleHasPermissionExample example);

    int updateByExample(@Param("record") RoleHasPermissionKey record, @Param("example") RoleHasPermissionExample example);
    
    List<RoleHasPermissionKey> getAll();
    
    int insert1(@Param("role_role_id") Integer roleRoleId,@Param("permission_per_id") Integer permissionPerId);
}