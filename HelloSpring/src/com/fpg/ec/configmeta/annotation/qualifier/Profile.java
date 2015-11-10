package com.fpg.ec.configmeta.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

	@Autowired
	@Qualifier("student1")
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
	
}
