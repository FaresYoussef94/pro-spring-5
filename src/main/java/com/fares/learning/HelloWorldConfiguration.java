package com.fares.learning;

import org.springframework.context.annotation.Bean;

import com.fares.learning.decoupling.HelloWorldMessageProvider;
import com.fares.learning.decoupling.MessageProvider;
import com.fares.learning.decoupling.MessageRenderer;
import com.fares.learning.decoupling.StandardOutMessageRenderer;

public class HelloWorldConfiguration {

	// equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}

}
