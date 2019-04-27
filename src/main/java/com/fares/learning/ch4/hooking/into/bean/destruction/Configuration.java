package com.fares.learning.ch4.hooking.into.bean.destruction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Lazy
	@Bean(initMethod = "init", destroyMethod = "destroy")
	BeanConfigurationBasedDestructiveBean getBeanConfigurationBasedDestruciveBean() {
		BeanConfigurationBasedDestructiveBean bean = new BeanConfigurationBasedDestructiveBean();
		bean.setFilePath("/Users/faresyoussef/Desktop/test.txt");
		return bean;
	}

}
