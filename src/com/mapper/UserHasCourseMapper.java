package com.mapper;

import com.pojo.UserHasCourseExample;
import com.pojo.UserHasCourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHasCourseMapper {
    long countByExample(UserHasCourseExample example);

    int deleteByExample(UserHasCourseExample example);

    int deleteByPrimaryKey(UserHasCourseKey key);

    int insert(UserHasCourseKey record);

    int insertSelective(UserHasCourseKey record);

    List<UserHasCourseKey> selectByExample(UserHasCourseExample example);

    int updateByExampleSelective(@Param("record") UserHasCourseKey record, @Param("example") UserHasCourseExample example);

    int updateByExample(@Param("record") UserHasCourseKey record, @Param("example") UserHasCourseExample example);
}