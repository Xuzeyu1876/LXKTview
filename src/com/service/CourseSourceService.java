package com.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.pojo.CourseSource;
public interface CourseSourceService {
	public List<CourseSource> showCourseSource(int courseId);
}
