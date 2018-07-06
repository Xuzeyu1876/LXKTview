package com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer userId;

    private Integer isValidate;

    private String username;

    private String userMail;

    private Date createTime;

    private Date latestLoginTime;

    private Integer userStatus;

    private Integer infoFrom;
    
    private String password;
    
    public String getPassword(){
    	return this.password;
    }
    
    public void setPassword(String password){
    	this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsValidate() {
        return isValidate;
    }

    public void setIsValidate(Integer isValidate) {
        this.isValidate = isValidate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLatestLoginTime() {
        return latestLoginTime;
    }

    public void setLatestLoginTime(Date latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getInfoFrom() {
        return infoFrom;
    }

    public void setInfoFrom(Integer infoFrom) {
        this.infoFrom = infoFrom;
    }
}