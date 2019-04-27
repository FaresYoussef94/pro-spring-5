package com.fares.learning.ch4.making.your.beans.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

public class ApplicationContextAwareShutDownBean implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if (applicationContext instanceof GenericApplicationContext) {
			((GenericApplicationContext) applicationContext).registerShutdownHook();
		}
	}

}
