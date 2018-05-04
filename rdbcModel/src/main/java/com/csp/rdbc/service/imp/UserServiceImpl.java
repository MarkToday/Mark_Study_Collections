package com.csp.rdbc.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csp.rdbc.dao.IRbacUserDao;
import com.csp.rdbc.entity.RbacUser;
import com.csp.rdbc.service.UserSercice;  
  
@Service("userService")  
public class UserServiceImpl implements UserSercice{  
  
    @Autowired
    private IRbacUserDao userDao;  
    
    /**
     * 获取所有用户
     */
    public List<RbacUser> getUser() {  
        return userDao.selectAllRbacUserList();  
    }

    /**
     * 根据用户id获取该用户信息
     */
	public RbacUser getUserById(String userId) {
		return userDao.selectByPrimaryKey(userId);
	} 
}  