package com.controller;


import org.junit.BeforeClass;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
  
import com.pojo.User;  
import com.service.UserService;  
  
  
//@RunWith(SpringJUnit4ClassRunner.class)  
//@ContextConfiguration(locations={"classpath:com/config/spring-mybatis.xml"})  
  
  
public class UserServiceImplTest {  
    @Autowired  
    private static UserService userService;  
      
    @BeforeClass  
    public static void init() {//junit֮ǰinit spring  
        ApplicationContext   context = new ClassPathXmlApplicationContext("classpath:com/config/spring-mybatis.xml");  
        userService = (UserService)context.getBean("userServiceImpl");  
    }  
  
  
    @Test  
    public void testGetUserById() {  
        User user=this.userService.getUserById(1);  
        System.out.println("-----------------------");  
        System.out.println(user.getUserId()+"");  
        System.out.println("-----------------------");  
      
    }  
}