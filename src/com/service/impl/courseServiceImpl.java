package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.transform.Source;

import org.springframework.stereotype.Service;
import com.mapper.CourseMapper;
import com.mapper.CourseSourceMapper;
import com.mapper.WebsiteResourcesMapper;
import com.pojo.Course;


import com.pojo.WebsiteResources;
import com.service.courseService;
@Service
public class courseServiceImpl implements courseService{
	@Resource
    private CourseMapper courseMapper; 
	
	@Resource
    private WebsiteResourcesMapper WsourceMapper;  

	@Override
	public int insert(Course course) {
		return courseMapper.insert(course);
	}

	@Override
	public List<Course> showCourse(String couSummary) {
		// TODO Auto-generated method stub
		return this.courseMapper.showCourseBySummary(couSummary);
	}

	@Override
	public int insertSelective(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.insertSelective(course);
	}

	@Override
	public List<Course> getAllcourse() {
		List<Course> course=courseMapper.showCourse();		
	      return  course;
	}

	
	public int addSource(WebsiteResources Wsource) {		
		return WsourceMapper.insertSelective(Wsource);
	}

	
	

}
