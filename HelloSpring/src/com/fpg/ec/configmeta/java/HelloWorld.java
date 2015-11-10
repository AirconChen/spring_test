package com.fpg.ec.configmeta.java;

public class HelloWorld {
	
	
	private String message;

	public String getMessage() {
		System.out.println("You get Message : " + message);
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Spring set your Message : " + message);
		this.message = message;
	}
	
}
