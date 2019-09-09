package org.lanqiao.service;


import org.lanqiao.entity.Student;
import org.lanqiao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private StudentMapper smapper;
	 public Student query() {
		 
		 return smapper.selectById(1); 
	 }
	

}
