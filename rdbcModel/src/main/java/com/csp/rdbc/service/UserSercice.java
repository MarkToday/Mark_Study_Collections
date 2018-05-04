package com.csp.rdbc.service;

import java.util.List;

import com.csp.rdbc.entity.RbacUser;  
  
public interface UserSercice { 
	/**
	 * 获取所有用户
	 * @return list
	 */
    public List<RbacUser> getUser();  
    
    /**
     * 根据用户id获取该用户信息
     * @param id
     * @return RbacUser对象
     */
    public RbacUser getUserById(String id);
}  