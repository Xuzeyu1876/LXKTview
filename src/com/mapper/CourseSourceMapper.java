package com.mapper;

import com.pojo.CourseSource;
import com.pojo.CourseSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSourceMapper {
    long countByExample(CourseSourceExample example);

    int deleteByExample(CourseSourceExample example);

    int deleteByPrimaryKey(Integer sourceId);

    int insert(CourseSource record);

    int insertSelective(CourseSource record);

    List<CourseSource> selectByExample(CourseSourceExample example);

    CourseSource selectByPrimaryKey(Integer sourceId);

    int updateByExampleSelective(@Param("record") CourseSource record, @Param("example") CourseSourceExample example);

    int updateByExample(@Param("record") CourseSource record, @Param("example") CourseSourceExample example);

    int updateByPrimaryKeySelective(CourseSource record);

    int updateByPrimaryKey(CourseSource record);
    
    List<CourseSource> showCourseSource(int courseId);
}