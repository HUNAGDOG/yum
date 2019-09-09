package org.lanqiao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("student")
public class Student {
	@TableId("stuno")
	private int stuno;
	@TableField("stuname")
	private String stuname;
	@TableField("stuage")
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuno, String stuname, int age) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.age = age;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", age=" + age + "]";
	}
	

}
