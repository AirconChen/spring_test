package com.fpg.ec.configmeta.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMetadata {
	
	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}
