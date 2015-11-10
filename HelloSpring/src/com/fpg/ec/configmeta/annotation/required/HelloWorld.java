package com.fpg.ec.configmeta.annotation.required;

import org.springframework.beans.factory.annotation.Required;

public class HelloWorld {
	
	
	private String message;

	public String getMessage() {
		System.out.println("You get Message : " + message);
		return message;
	}

	@Required
	public void setMessage(String message) {
		System.out.println("Spring set your Message : " + message);
		this.message = message;
	}
	
}
