package com.fares.learning.decoupling;

public interface MessageRenderer {
	
	void render();
	
	public void setMessageProvider(MessageProvider provider);
	
	MessageProvider getMessageProvider();
	
}
