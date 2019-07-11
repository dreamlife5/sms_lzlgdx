
package com.briup.apps.sms.dao;

import java.awt.List;

public interface RoleDao<Role> {
	List selectAll();
	void insert(Role role);
	void update(Role role);
	void deleteById(long Id);
	
} 

