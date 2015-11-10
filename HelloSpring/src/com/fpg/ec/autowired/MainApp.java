package com.fpg.ec.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/fpg/ec/autowired/Beans.xml");

	      Student theStudent = (Student) context.getBean("student");
	      
//	      System.out.println("theStudent.getSchool().getName():"+theStudent.getSchool().getName());
//	      System.out.println("theStudent.getSchool().getAddress():"+theStudent.getSchool().getAddress());
	      System.out.println("theStudent.getName():"+theStudent.getName());
	      System.out.println("theStudent.getGender():"+theStudent.getGender());
	      
	   }
}
