package com.fpg.ec.configmeta.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
	@Autowired
	private TestObject testObject;

//	@Autowired
//	public HelloWorld(TestObject testObject){
//		this.testObject = testObject;
//	}
	
	public TestObject getTestObject() {
		return testObject;
	}

//	@Autowired
//	public void setTestObject(TestObject testObject) {
//		this.testObject = testObject;
//	}
	
}

