package com.mapper;

import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.User;
import com.pojo.UserExample;
import com.pojo.combinePojo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);
    
    List<combinePojo> showAlluser(); 
    
    User findUser(@Param("user_mail") String user_mail,@Param("password") String password);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> showUser(@Param("user_status") Integer user_status);
    
    List<User> selectUser(String username);
    
    int deleteUser(@Param("user_id") Integer user_id,@Param("user_status") Integer user_status);
    //根据用户Id获取该用户角色
  
}