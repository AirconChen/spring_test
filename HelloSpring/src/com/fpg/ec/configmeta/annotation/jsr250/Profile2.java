package com.fpg.ec.configmeta.annotation.jsr250;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Profile2 implements InitializingBean, DisposableBean {

	@Autowired
	private Student student;
	
	public Profile2(){
		System.out.println("new Profile2的建構子 ");
	}
	
	public void printName(){
		System.out.println("我是"+student.getName());
	}
	
	public void printGender(){
		System.out.println("你們知道我是"+student.getGender()+"?");
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("我是afterPropertiesSet的方法，我被執行到了!!!");
	}

	
	@Override
	public void destroy() throws Exception {
		System.out.println("我是destroy的方法，profile2 銷毀了!!!");
		
	}	
	
}
