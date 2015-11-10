package com.fpg.ec;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	
	
	 public static void main(String[] args) {
		 
		 MainApp theMainApp = new MainApp();
		 String classPath = theMainApp.getClass().getPackage().getName().replace(".", "/");
		 System.out.println("classPath:"+classPath);
		 
		 
		 /**
		  * 方式1.透過 BeanFactory 
		  */
		 BeanFactory factory = new XmlBeanFactory(new ClassPathResource(classPath+"/Beans.xml"));
		 HelloWorld theHelloWorld = (HelloWorld) factory.getBean("helloWorld");
		 theHelloWorld.getMessage();
		 
		 
		 /**
		  * 方式2.透過ApplicationContext
		  */
	      ApplicationContext context = new ClassPathXmlApplicationContext("classpath:"+classPath+"/Beans.xml");
//	      ApplicationContext context = new FileSystemXmlApplicationContext("classpath:"+classPath+"/Beans.xml");
	      
	      
	      HelloWorld theHelloWorld2 = (HelloWorld) context.getBean("helloWorld");
	      theHelloWorld2.getMessage();
	      
	      
	   }
}
