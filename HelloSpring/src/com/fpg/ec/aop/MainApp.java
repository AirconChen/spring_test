package com.fpg.ec.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/fpg/ec/aop/Beans.xml");

		 System.out.println("A");
	      Student student = (Student) context.getBean("student");
	      System.out.println("B");
	      student.getName();
	      student.getAge();
	      student.printThrowException();
	   }
}
