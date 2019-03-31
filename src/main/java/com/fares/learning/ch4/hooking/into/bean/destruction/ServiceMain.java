package com.fares.learning.ch4.hooking.into.bean.destruction;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/*
 * This class tests the implementations for the different way of destroying bean callback:
 * 1- method based
 * 2- interface based
 * 3- annotation based
 * 4- @bean configuration
 */

public class ServiceMain {

	public static void main(String... strings) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
				new ClassPathResource("app-context-hook-into-bean-destruction.xml"));

//		methodBasedDestruction(ctx);
		
//		interfaceBasedDesturction(ctx);
		
//		annotationBasedDestruction(ctx);
		
//		beanConfigurationBasedDestruction(ctx);

		ctx.registerShutdownHook();
	}

	public static void methodBasedDestruction(GenericXmlApplicationContext ctx) {

		MethodBasedDestructiveBean methodBeanDestructiveBean = (MethodBasedDestructiveBean) ctx
				.getBean("methodBasedDestructiveBean");

	}

	public static void interfaceBasedDesturction(GenericXmlApplicationContext ctx) {

		InterfaceBasedDestructiveBean interfaceBasedDestructiveBean = (InterfaceBasedDestructiveBean) ctx
				.getBean("interfaceBasedDestructiveBean");

	}

	public static void annotationBasedDestruction(GenericXmlApplicationContext ctx) {

		AnnotationBasedDestructiveBean annotationBasedDestructiveBean = (AnnotationBasedDestructiveBean) ctx.getBean("annotationBasedDestructiveBean");
		
	}
	
	public static void beanConfigurationBasedDestruction(GenericXmlApplicationContext ctx) {
		
		BeanConfigurationBasedDestructiveBean beanConfigurationBasedDestructiveBean = (BeanConfigurationBasedDestructiveBean) ctx.getBean("beanConfigurationBasedDestruciveBean");
		
	}

}
