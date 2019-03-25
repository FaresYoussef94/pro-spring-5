package com.fares.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fares.learning.decoupling.MessageRenderer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();

	}
}
