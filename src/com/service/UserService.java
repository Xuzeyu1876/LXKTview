package com.service;
import java.util.List;

import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.User;
import com.pojo.combinePojo;  

public interface UserService {  
    public User getUserById(int id); 
    public User findUser(String userMail,String password);
    public List<combinePojo> getUser();
    
    public List<User> selectUser(String username);
    
    public int  insert (User user);
    
    public int deleteUser(Integer userId,Integer userStatus);
    //�ж��û��Ƿ�ӵ�о���ĳ��Ȩ��
    public boolean ownPermission(String url,List<Permission> per);
    public List<User> showUser();
   
}  
