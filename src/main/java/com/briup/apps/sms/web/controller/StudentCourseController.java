package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.service.StudentCourseService;

@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
	
	@Autowired
	private StudentCourseService studentCourseService;
	
	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(StudentCourse studentCourse) {
		try {
			studentCourseService.saveOrUpdate(studentCourse);
			return "保存或更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
	}
	

	// http://localhost:8080/studentcourse/selectAll
	@GetMapping("selectAll")
	public List<StudentCourse> selectAll(){
		return studentCourseService.selectAll();
	} 
	
	// http://localhost:8080/studentcourse/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			studentCourseService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	
	
	
	
}
