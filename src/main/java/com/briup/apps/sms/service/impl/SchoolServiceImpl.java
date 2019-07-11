package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.service.SchoolService;
/**
 *校园业务逻辑处理的实现类 
 **/
@Service
public class SchoolServiceImpl implements SchoolService{
     //依赖注入，实例化UserDao并且赋值给userDao这个变量
	@Resource
	private SchoolDao schoolDao;
	@Override
	public List<School> selectAll(){
	return schoolDao.selectAll();
	}
	@Override
	public void saveOrUpdate(School school) throws Exception{
		if(school.getId() == null) {
			schoolDao.insert(school);
		}else {
			schoolDao.update(school);
		}
	}
	@Override
	public void deleteById(long id) throws Exception {
		
		
	}
}