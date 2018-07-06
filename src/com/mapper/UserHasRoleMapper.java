package com.mapper;

import com.pojo.Role;
import com.pojo.UserHasRoleExample;
import com.pojo.UserHasRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHasRoleMapper {
    long countByExample(UserHasRoleExample example);

    int deleteByExample(UserHasRoleExample example);

    int deleteByPrimaryKey(UserHasRoleKey key);

    int insert(UserHasRoleKey record);

    int insertSelective(UserHasRoleKey record);

    List<UserHasRoleKey> selectByExample(UserHasRoleExample example);

    int updateByExampleSelective(@Param("record") UserHasRoleKey record, @Param("example") UserHasRoleExample example);

    int updateByExample(@Param("record") UserHasRoleKey record, @Param("example") UserHasRoleExample example);
    
    UserHasRoleKey isRole(@Param("user_user_id") Integer user_user_id);
    

    
}