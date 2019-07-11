package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.UserRole;

public interface  UserRoleDao {
	//查询所有
    List<UserRole> selectAll();
    // 插入
    void insert(UserRole userrole);
    // 更新
    void update(UserRole userrole);
   //  删除
    void deleteById(long id);
    
}
