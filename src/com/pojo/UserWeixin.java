package com.pojo;

public class UserWeixin {
    private Integer userWeixinId;

    private String wxNumber;

    private String wxImage;

    private Integer userId;

    public Integer getUserWeixinId() {
        return userWeixinId;
    }

    public void setUserWeixinId(Integer userWeixinId) {
        this.userWeixinId = userWeixinId;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    public String getWxImage() {
        return wxImage;
    }

    public void setWxImage(String wxImage) {
        this.wxImage = wxImage;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}