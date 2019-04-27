package com.fares.learning.ch4.configuration.using.java.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceMain {

	public static void main(String... strings) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		renderer.render();
	}

}
