package org.lanqio.controller;

import javax.servlet.http.HttpServletRequest;

import org.lanqiao.entity.Student;
import org.lanqiao.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	@Autowired
	MyService service ;
	
	@RequestMapping("test")
	@ResponseBody
	public Student query() {
		
		return service.query();
		
	}
	@RequestMapping("/dosth")
	@ResponseBody
	public String doget() {
		System.out.println("**********************************");
		return"success";
		
	}
	

}
