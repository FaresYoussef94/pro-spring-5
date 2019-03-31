package com.fares.learning.ch4.declaring.an.initialization.method.using.bean.annotatation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ServiceMain {

	public static void main() {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		BeanConfigurationSinger singerOne = (BeanConfigurationSinger) ctx.getBean("singerOne");
		BeanConfigurationSinger singerTwo = (BeanConfigurationSinger) ctx.getBean("singerOne");
		BeanConfigurationSinger singerThere = (BeanConfigurationSinger) ctx.getBean("singerOne");
		ctx.close();
	}

}
