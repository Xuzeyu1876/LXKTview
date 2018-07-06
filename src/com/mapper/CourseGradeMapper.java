package com.mapper;

import com.pojo.CourseGrade;
import com.pojo.CourseGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseGradeMapper {
    long countByExample(CourseGradeExample example);

    int deleteByExample(CourseGradeExample example);

    int deleteByPrimaryKey(Integer couGradeId);

    int insert(CourseGrade record);

    int insertSelective(CourseGrade record);

    List<CourseGrade> selectByExample(CourseGradeExample example);

    CourseGrade selectByPrimaryKey(Integer couGradeId);

    int updateByExampleSelective(@Param("record") CourseGrade record, @Param("example") CourseGradeExample example);

    int updateByExample(@Param("record") CourseGrade record, @Param("example") CourseGradeExample example);

    int updateByPrimaryKeySelective(CourseGrade record);

    int updateByPrimaryKey(CourseGrade record);
}