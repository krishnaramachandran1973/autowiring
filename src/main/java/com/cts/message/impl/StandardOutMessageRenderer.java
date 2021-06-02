package com.cts.message.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cts.message.MessageProvider;
import com.cts.message.MessageRenderer;

@Component("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	private static Logger logger = LoggerFactory.getLogger(StandardOutMessageRenderer.class);

	private MessageProvider messageProvider;

	@Autowired
	@Qualifier("configurableProvider")
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;

	}

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("Set the MessageProvider of class" + StandardOutMessageRenderer.class.getName());
		}
		logger.info(messageProvider.getMessage());
	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
