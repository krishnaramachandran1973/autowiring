package com.cts.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfigurer.class);
		MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
		renderer.render();
	}

}
