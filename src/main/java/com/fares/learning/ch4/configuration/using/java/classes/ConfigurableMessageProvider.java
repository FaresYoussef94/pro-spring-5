package com.fares.learning.ch4.configuration.using.java.classes;

public class ConfigurableMessageProvider implements MessageProvider {

	private String message = "Default  message";

	public ConfigurableMessageProvider() {
	}

	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
