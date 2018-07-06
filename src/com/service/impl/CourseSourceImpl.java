package com.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;  
  
import com.mapper.CourseSourceMapper;  
import com.pojo.CourseSource;  
import com.service.CourseSourceService;
@Service
public class CourseSourceImpl implements CourseSourceService{
	@Resource
	private CourseSourceMapper CourseSourceMapper;
	public List<CourseSource> showCourseSource(int courseId){
		return this.CourseSourceMapper.showCourseSource(courseId);
	}
}
