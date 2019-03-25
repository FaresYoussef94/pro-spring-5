package com.fares.learning.ioc.and.di.ch3;

public interface MessageRenderer {
	
	void render();
	
	public void setMessageProvider(MessageProvider provider);
	
	MessageProvider getMessageProvider();
	
}
