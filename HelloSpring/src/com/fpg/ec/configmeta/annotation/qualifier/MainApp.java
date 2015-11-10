package com.fpg.ec.configmeta.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	
	 public static void main(String[] args) {
		 
		 MainApp theMainApp = new MainApp();
		 String classPath = theMainApp.getClass().getPackage().getName().replace(".", "/");
		 System.out.println("classPath:"+classPath);
		 
		 
		 /**
		  * 方式2.透過ApplicationContext
		  */
	      ApplicationContext context = new ClassPathXmlApplicationContext("classpath:"+classPath+"/Beans.xml");
	      Profile theProfile = (Profile) context.getBean("profile");
	      theProfile.printName();
	      theProfile.printGender();
	      
	      
	   }
}
