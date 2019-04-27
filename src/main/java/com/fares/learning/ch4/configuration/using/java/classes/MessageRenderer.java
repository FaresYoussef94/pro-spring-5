package com.fares.learning.ch4.configuration.using.java.classes;

public interface MessageRenderer {
	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();
}
