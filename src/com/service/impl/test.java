package com.service.impl;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
import com.mapper.UserMapper;  
import com.pojo.User;  
import com.service.UserService;  
  

public class test {  
    @Autowired  
    private UserMapper userMapper;  
  
    public User getUserById(int id) {  
        return this.userMapper.selectByPrimaryKey(id);  
    }  
}  