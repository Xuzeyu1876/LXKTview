package com.pojo;

public class CourseGrade {
    private Integer couGradeId;

    private Integer userId;

    private Integer courseId;

    private Float couGrade;

    public Integer getCouGradeId() {
        return couGradeId;
    }

    public void setCouGradeId(Integer couGradeId) {
        this.couGradeId = couGradeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Float getCouGrade() {
        return couGrade;
    }

    public void setCouGrade(Float couGrade) {
        this.couGrade = couGrade;
    }
}