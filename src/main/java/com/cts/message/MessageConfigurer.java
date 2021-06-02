package com.cts.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.cts.message.impl" })
public class MessageConfigurer {

	@Bean
	public String message() {
		return "Spring gives us many options!!!";
	}
}
