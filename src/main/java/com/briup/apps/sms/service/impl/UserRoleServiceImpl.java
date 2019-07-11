package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.dao.UserRoleDao;
import com.briup.apps.sms.service.UserRoleService;
 @Service
public class UserRoleServiceImpl implements UserRoleService{
   @Resource
   private  UserRoleDao  userroleDao;
   @Override
   public List<UserRole>selectAll(){
	   return userroleDao.selectAll();
   }
   @Override
   public void saveOrUpdate(UserRole userrole)throws Exception{
	   if(userrole.getId()==null) {
		   userroleDao.insert(userrole);
	   }
	   else {
		   userroleDao.update(userrole);
	   }
 }
   @Override
   public void deleteById(long id) throws Exception{
	   userroleDao.deleteById(id);
     }
  }
