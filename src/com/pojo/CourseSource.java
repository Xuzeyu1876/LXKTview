package com.pojo;

import java.util.Date;

public class CourseSource {
    private Integer sourceId;

    private Integer courseId;

    private String souName;

    private Integer souType;

    private Integer souDloadNum;

    private Date souUloadTime;

    private String souUrl;

    private Integer souStatus;

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSouName() {
        return souName;
    }

    public void setSouName(String souName) {
        this.souName = souName;
    }

    public Integer getSouType() {
        return souType;
    }

    public void setSouType(Integer souType) {
        this.souType = souType;
    }

    public Integer getSouDloadNum() {
        return souDloadNum;
    }

    public void setSouDloadNum(Integer souDloadNum) {
        this.souDloadNum = souDloadNum;
    }

    public Date getSouUloadTime() {
        return souUloadTime;
    }

    public void setSouUloadTime(Date souUloadTime) {
        this.souUloadTime = souUloadTime;
    }

    public String getSouUrl() {
        return souUrl;
    }

    public void setSouUrl(String souUrl) {
        this.souUrl = souUrl;
    }

    public Integer getSouStatus() {
        return souStatus;
    }

    public void setSouStatus(Integer souStatus) {
        this.souStatus = souStatus;
    }
}