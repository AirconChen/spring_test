package com.fpg.ec.configmeta.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	
	 public static void main(String[] args) {
		 
		 
	      ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationMetadata.class);
	      
	      
	      HelloWorld theHelloWorld2 = (HelloWorld) context.getBean(HelloWorld.class);
	      theHelloWorld2.setMessage("好麻煩喔!!");
	      theHelloWorld2.getMessage();
	      
	      
	   }
}
