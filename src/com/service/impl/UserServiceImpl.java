package com.service.impl;  
  
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;  
  
import com.mapper.UserMapper;
import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.User;
import com.pojo.combinePojo;
import com.service.UserService;  
  
@Service(value="userService") 
public class UserServiceImpl implements UserService{  
	
	@Resource
    private UserMapper userMapper;  
  
	
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

    public User getUserById(int id) { 
    	// ClassPathXmlApplicationContext   context = new ClassPathXmlApplicationContext("classpath:com/config/spring-mybatis.xml");  
        // userMapper = (UserMapper)context.getBean("userMapper"); 
    //	System.out.print("********"+this.userMapper+"\n");
        return this.userMapper.selectByPrimaryKey(id);  
    }  
    public User findUser(String userMail,String password){
    	return userMapper.findUser(userMail,password);
    }
/*	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		List<User> user=userMapper.showAlluser();
		 if(user.size()==0){
			 System.out.println("error!");
		 } 
	     return user;
		
	}*/

	public List<combinePojo> getUser() {
		//查看未注销用户
		
		List<combinePojo> user=userMapper.showAlluser();
		 if(user.size()==0){
			 System.out.println("error!");
		 } 
		
	      return user;
		
		
	}

	public List<User> selectUser(String username) {
		List<User> user=userMapper.selectUser(username);
		
		return user;
	}

	public int deleteUser(Integer userId,Integer userStatus){
		System.out.println("error!");
		 return userMapper.deleteUser(userId,userStatus);
		 
	}
	
/*url为匹配路径，per为权限集合*/
	@Override
	public boolean ownPermission(String url, List<Permission>per) {
		if(per!=null){		
			for(int i=0;i<per.size();i++){
				if(url.equals(per.get(i).getPerUrl()))
					return true;						
			}
			System.out.println("用户没有该项权限！");
			return false;
			
		}
		return false;			
	}

	@Override
	public List<User> showUser() {
		
		return userMapper.showUser(0);
	}




}  