package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class RoleHasPermissionKey {
    private Integer roleRoleId;

    private Integer permissionPerId;

    public Integer getRoleRoleId() {
        return roleRoleId;
    }

    public void setRoleRoleId(Integer roleRoleId) {
        this.roleRoleId = roleRoleId;
    }

    public Integer getPermissionPerId() {
        return permissionPerId;
    }

    public void setPermissionPerId(Integer permissionPerId) {
        this.permissionPerId = permissionPerId;
    }


}