package com.fares.learning.ioc.and.di.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DeclareSpringComponents {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-xml.xml"));
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}

}
