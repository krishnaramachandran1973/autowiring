package com.cts.message.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.message.MessageProvider;

@Component("configurableProvider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;

	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}
