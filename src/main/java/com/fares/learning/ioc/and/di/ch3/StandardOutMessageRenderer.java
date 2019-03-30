package com.fares.learning.ioc.and.di.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;

	public StandardOutMessageRenderer(MessageProvider messageProvider) {
		this.messageProvider=messageProvider;
	}
	
	public void render() {

		if (getMessageProvider() == null) {
			throw new RuntimeException(
					"You must provide a MessageProvider of type: " + MessageProvider.class.getName());
		}
		System.out.println(getMessageProvider().getMessage());

	}

//	@Autowired
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
