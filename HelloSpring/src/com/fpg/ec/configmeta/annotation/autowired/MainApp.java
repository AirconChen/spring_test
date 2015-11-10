package com.fpg.ec.configmeta.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	
	 public static void main(String[] args) {
		 
		 MainApp theMainApp = new MainApp();
		 String classPath = theMainApp.getClass().getPackage().getName().replace(".", "/");
		 System.out.println("classPath:"+classPath);
		 
		 
		 /**
		  * 透過ApplicationContext
		  */
	      ApplicationContext context = new ClassPathXmlApplicationContext("classpath:"+classPath+"/Beans.xml");
	      HelloWorld theHelloWorld2 = (HelloWorld) context.getBean("helloWorld");

	      theHelloWorld2.getTestObject().hello();
	      
	   }
}
