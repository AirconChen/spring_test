package com.fpg.ec.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitProcessor implements BeanPostProcessor{

	

	/**
	 * 第一個參數是 Bean
	 * 第二個參數是 BeanName
	 */
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization is called by Spring");
		System.out.println("Bean:"+arg0.getClass().getName());
		System.out.println("Bean name:"+arg1);
		return arg0;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessAfterInitialization is called by Spring");
		System.out.println("Bean:"+arg0.getClass().getName());
		System.out.println("Bean name:"+arg1);
		return arg0;
	}
}
