package com.fpg.ec.configmeta.annotation.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Profile {

	private Student student;
	
	public Profile(){
		System.out.println("new Profile的建構子 ");
	}
	
	public void printName(){
		System.out.println("我是"+student.getName());
	}
	
	public void printGender(){
		System.out.println("你們知道我是"+student.getGender()+"?");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("我是init的方法，我被執行到了!!!");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("我是destroy的方法，我被銷毀了!!!");
	}

	public Student getStudent() {
		return student;
	}

	@Resource(name="student1")
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
}
