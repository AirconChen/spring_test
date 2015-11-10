package com.fpg.ec.configmeta.annotation.jsr250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	
	 public static void main(String[] args) {
		 
		 MainApp theMainApp = new MainApp();
		 String classPath = theMainApp.getClass().getPackage().getName().replace(".", "/");
		 System.out.println("classPath:"+classPath);
		 
		 
		 /**
		  * 透過AbstractApplicationContext
		  */
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:"+classPath+"/Beans.xml");
//	      Profile theProfile = (Profile) context.getBean("profile");
//	      System.out.println("我是準備使用方法的log");
//	      theProfile.printName();
//	      theProfile.printGender();
//	      context.close();
	      
	      
	      
	      
	      Profile2 theProfile2 = (Profile2) context.getBean("profile2");
	      theProfile2.printName();
	      theProfile2.printGender();
	      context.close();
	      
	      
	   }
}
