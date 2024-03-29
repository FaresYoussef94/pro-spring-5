package com.fares.learning.ch4.access.resources;

import java.io.File;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ServiceMain {

	public static void main(String... strings) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext();

		File file = File.createTempFile("test", "txt");
		file.deleteOnExit();
		Resource res1 = ctx.getResource("file://" + file.getPath());
		displayInfo(res1);
		Resource res2 = ctx.getResource("classpath:test.txt");
		displayInfo(res2);
		Resource res3 = ctx.getResource("http://www.google.com");
		displayInfo(res3);

	}

	private static void displayInfo(Resource res) throws Exception {
		System.out.println(res.getClass());
		System.out.println(res.getURL().getContent());
		System.out.println("");
	}

}
