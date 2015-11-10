package com.fpg.ec.inheritance;


public class Student {
	
	private String name;
	private String gender;
	private String age;
	
	
	public String getName() {
		System.out.println("我是"+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		System.out.println("我是"+gender);
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		System.out.println("我今年"+age+"歲");
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
