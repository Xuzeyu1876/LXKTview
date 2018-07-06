package com.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Course {
    private Integer couId;

    private String couName;

    private String couImage;

    private Integer couSales;

    private Float couGrade;

    private Integer couStatus;

    private Date couLinetime;

    private Date couUpdatetime;

    private Integer couPlatformVisit;

    private Integer couOurVisit;

    private String couSummary;

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }

    public String getCouImage() {
        return couImage;
    }

    public void setCouImage(String couImage) {
        this.couImage = couImage;
    }

    public Integer getCouSales() {
        return couSales;
    }

    public void setCouSales(Integer couSales) {
        this.couSales = couSales;
    }

    public Float getCouGrade() {
        return couGrade;
    }

    public void setCouGrade(Float couGrade) {
        this.couGrade = couGrade;
    }

    public Integer getCouStatus() {
        return couStatus;
    }

    public void setCouStatus(Integer couStatus) {
        this.couStatus = couStatus;
    }

    public Date getCouLinetime() {
        return couLinetime;
    }

    public void setCouLinetime(Date couLinetime) {
        this.couLinetime = couLinetime;
    }

    public Date getCouUpdatetime() {
        return couUpdatetime;
    }

    public void setCouUpdatetime(Date couUpdatetime) {
        this.couUpdatetime = couUpdatetime;
    }

    public Integer getCouPlatformVisit() {
        return couPlatformVisit;
    }

    public void setCouPlatformVisit(Integer couPlatformVisit) {
        this.couPlatformVisit = couPlatformVisit;
    }

    public Integer getCouOurVisit() {
        return couOurVisit;
    }

    public void setCouOurVisit(Integer couOurVisit) {
        this.couOurVisit = couOurVisit;
    }

    public String getCouSummary() {
        return couSummary;
    }

    public void setCouSummary(String couSummary) {
        this.couSummary = couSummary;
    }
}