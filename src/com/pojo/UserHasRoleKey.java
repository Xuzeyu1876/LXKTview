package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class UserHasRoleKey {
    private Integer userUserId;

    private Integer roleRoleId;

    public Integer getUserUserId() {
        return userUserId;
    }

    public void setUserUserId(Integer userUserId) {
        this.userUserId = userUserId;
    }

    public Integer getRoleRoleId() {
        return roleRoleId;
    }

    public void setRoleRoleId(Integer roleRoleId) {
        this.roleRoleId = roleRoleId;
    }
}