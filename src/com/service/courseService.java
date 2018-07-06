package com.service;

import java.util.List;
import com.pojo.Course;
import com.pojo.WebsiteResources;


public interface courseService {
	public int insert(Course course);
	public int insertSelective(Course course);
	public List<Course> getAllcourse();
	public int addSource(WebsiteResources Wsource);
	public List<Course> showCourse(String couSummary);
}
