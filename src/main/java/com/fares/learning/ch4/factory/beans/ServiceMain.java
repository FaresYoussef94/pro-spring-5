package com.fares.learning.ch4.factory.beans;

import java.security.MessageDigest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ServiceMain {

	/*
	 * This is used to run the examples on the FactoryBean implementations
	 */

	public static void main(String... strings) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-ch4-factory-beans.xml"));
		ctx.refresh();

		usingFactoryBeansWithXmlConfigurations(ctx);

		usingFactoryBeansWithJavaConfiguration();
		
		accessingFactoryBeanDirectly(ctx);
		
		usingFactoryBeanAndFactoryMethodAttribute(ctx);

		ctx.close();
	}

	//The following method shows the implementation of the FactoryBean loaded form an xml configuration file
	public static void usingFactoryBeansWithXmlConfigurations(GenericXmlApplicationContext ctx) {
		MessageDigester messageDigester = ctx.getBean("digester", MessageDigester.class);
		messageDigester.digest("Hello World");
	}

	//The following method shows the implementation of the FactoryBean loaded form an java configuration class
	public static void usingFactoryBeansWithJavaConfiguration() {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		MessageDigester digester = (MessageDigester) ctx.getBean("digester");
		digester.digest("Hello World!");
		ctx.close();
	}
	
	//The following mehtod shows the implementation of accessing the FactoryBean directly
	public static void accessingFactoryBeanDirectly(GenericXmlApplicationContext ctx) {
		MessageDigestFactoryBean messageDigestFactoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
		try {
			MessageDigest digest = messageDigestFactoryBean.getObject();
			System.out.println(digest.digest("Hello World!".getBytes()));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//The following methods shows the implementation of using the factory-bean and factory-method attributes
	public static void usingFactoryBeanAndFactoryMethodAttribute(GenericXmlApplicationContext ctx) {
		
		MessageDigester messageDigester = (MessageDigester) ctx.getBean("digesterFactoryBeanAttribute");
		messageDigester.digest("Hello World!");
		
	}

}
