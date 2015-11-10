package com.fpg.ec.inheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	
	 public static void main(String[] args) {
		 
		 MainApp theMainApp = new MainApp();
		 String classPath = theMainApp.getClass().getPackage().getName().replace(".", "/");
		 
		 /**
		  * 透過AbstractApplicationContext
		  */
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:"+classPath+"/Beans.xml");
	      
	      
		  Student theAircon = (Student) context.getBean("student1");
	      
		  theAircon.getName();
		  theAircon.getGender();
		  theAircon.getAge();
		  
		  Student theLongZero = (Student) context.getBean("student2");
		  theLongZero.getName();
		  theLongZero.getGender();
		  theLongZero.getAge();
		  
		  
	      context.close();
	      
	      
	   }
}
