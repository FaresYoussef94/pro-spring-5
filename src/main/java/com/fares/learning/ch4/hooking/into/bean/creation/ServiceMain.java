package com.fares.learning.ch4.hooking.into.bean.creation;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ServiceMain {

	/*
	 * 
	 * This class tests the Hooking Into Bean Creation It defines three methods that
	 * differentiate between the three bean creation event techniques 1- method
	 * based 2- interface based 3- annotation based
	 * 
	 */

	public static void main(String... strings) {
//		methodBasedHookIntoBeanCreation();

//		interfaceBasedHookIntoBeanCreation();
		
		annotationBasedHookIntoBeanCreation();
	}

	public static void methodBasedHookIntoBeanCreation() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-method-based-hook-into-bean-creation.xml"));
		ctx.refresh();

		MethodBasedSinger beanOne = (MethodBasedSinger) ctx.getBean("singerOne");
		System.out.println(beanOne);

		MethodBasedSinger beanTwo = (MethodBasedSinger) ctx.getBean("singerTwo");
		System.out.println(beanTwo);

		MethodBasedSinger beanThree = (MethodBasedSinger) ctx.getBean("singerThree");
		System.out.println(beanThree);

		ctx.close();
	}

	public static void interfaceBasedHookIntoBeanCreation() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-interface-based-hook-into-bean-creation.xml"));
		ctx.refresh();

		InterfaceBasedSinger beanOne = (InterfaceBasedSinger) ctx.getBean("singerOne");
		System.out.println(beanOne);

		InterfaceBasedSinger beanTwo = (InterfaceBasedSinger) ctx.getBean("singerTwo");
		System.out.println(beanTwo);

		InterfaceBasedSinger beanThree = (InterfaceBasedSinger) ctx.getBean("singerThree");
		System.out.println(beanThree);

		ctx.close();
	}

	public static void annotationBasedHookIntoBeanCreation() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(new ClassPathResource("app-context-annotation-based-hook-into-bean-creation.xml"));
		ctx.refresh();

		AnnotationBasedSinger beanOne = (AnnotationBasedSinger) ctx.getBean("singerOne");
		System.out.println(beanOne);

		AnnotationBasedSinger beanTwo = (AnnotationBasedSinger) ctx.getBean("singerTwo");
		System.out.println(beanTwo);

		AnnotationBasedSinger beanThree = (AnnotationBasedSinger) ctx.getBean("singerThree");
		System.out.println(beanThree);

		ctx.close();
	}

}
