package com.fares.learning.decoupling;

import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;

	public void render() {

		if (getMessageProvider() == null) {
			throw new RuntimeException(
					"You must provide a MessageProvider of type: " + MessageProvider.class.getName());
		}
		System.out.println(getMessageProvider().getMessage());

	}

	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
