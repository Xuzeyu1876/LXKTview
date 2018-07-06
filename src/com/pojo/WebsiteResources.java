package com.pojo;

public class WebsiteResources {
    private Integer webRcId;

    private Integer courseId;

    private Integer fromWebsiteId;

    private String rcName;

    private String rcUrl;

    private Integer rcVisit;

    public Integer getWebRcId() {
        return webRcId;
    }

    public void setWebRcId(Integer webRcId) {
        this.webRcId = webRcId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getFromWebsiteId() {
        return fromWebsiteId;
    }

    public void setFromWebsiteId(Integer fromWebsiteId) {
        this.fromWebsiteId = fromWebsiteId;
    }

    public String getRcName() {
        return rcName;
    }

    public void setRcName(String rcName) {
        this.rcName = rcName;
    }

    public String getRcUrl() {
        return rcUrl;
    }

    public void setRcUrl(String rcUrl) {
        this.rcUrl = rcUrl;
    }

    public Integer getRcVisit() {
        return rcVisit;
    }

    public void setRcVisit(Integer rcVisit) {
        this.rcVisit = rcVisit;
    }
}