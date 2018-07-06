package com.mapper;

import com.pojo.UserQq;
import com.pojo.UserQqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserQqMapper {
    long countByExample(UserQqExample example);

    int deleteByExample(UserQqExample example);

    int deleteByPrimaryKey(Integer userQqId);

    int insert(UserQq record);

    int insertSelective(UserQq record);

    List<UserQq> selectByExample(UserQqExample example);

    UserQq selectByPrimaryKey(Integer userQqId);

    int updateByExampleSelective(@Param("record") UserQq record, @Param("example") UserQqExample example);

    int updateByExample(@Param("record") UserQq record, @Param("example") UserQqExample example);

    int updateByPrimaryKeySelective(UserQq record);

    int updateByPrimaryKey(UserQq record);
}