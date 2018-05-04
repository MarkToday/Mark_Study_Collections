package com.csp.rdbc.dao;

import java.util.List;

import com.csp.rdbc.entity.RbacUser;

public interface IRbacUserDao {
    int deleteByPrimaryKey(String userId);

    int insert(RbacUser record);

    int insertSelective(RbacUser record);

    RbacUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(RbacUser record);

    int updateByPrimaryKey(RbacUser record);
    
    //查询所有权限管理用户信息
    List<RbacUser> selectAllRbacUserList();
    
}