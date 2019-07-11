package com.briup.apps.sms.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.service. RoleService;
/**
 *校园业务逻辑处理的实现类 
 **/
@Service
public class  RoleServiceImpl implements RoleService{
	@Resource
	private RoleService roleService;
	@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return roleService.selectAll();
	}

	@Override
	public void saveOrUpdate(Role role) throws Exception {
		// TODO Auto-generated method stub
		roleService.saveOrUpdate(role);
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		roleService.deleteById(id);
	}
	


	
	
}
