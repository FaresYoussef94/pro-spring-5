package com.fares.learning.ch4.making.your.beans.spring.aware;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ServiceMain {

	/*
	 * The beanNameAwareSinger method shows simple implementation to the BeanNameAware interface which gives the bean access to it's name
	 */
	
	public static void main(String ...strings) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-making-your-bean-spring-aware.xml"));
		ctx.refresh();
		
		beanNameAwareSinger(ctx);
		
		ctx.close();
	}
	
	public static void beanNameAwareSinger(GenericXmlApplicationContext ctx) {
		
		BeanNameAwareSinger beanNameAwareSinger = (BeanNameAwareSinger) ctx.getBean("johnMayer");
		beanNameAwareSinger.sing();
		
	}

}
