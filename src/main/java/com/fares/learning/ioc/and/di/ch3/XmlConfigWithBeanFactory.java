package com.fares.learning.ioc.and.di.ch3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String... strings) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(factory);
		xmlReader.loadBeanDefinitions(new ClassPathResource("xml-bean-factory-config.xml"));
		Oracle oracle = (Oracle) factory.getBean("oracle");
		System.out.println(oracle.defineMeaningOfLife());

	}

}
