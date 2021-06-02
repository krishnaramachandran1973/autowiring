package com.cts.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("collection")
public class CollectionInjection {

	@Autowired
	private List<Person> persons;

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CollectionConfigurer.class);
		CollectionInjection bean = ctx.getBean("collection", CollectionInjection.class);
		bean.persons.forEach(person -> System.out.println(person));
	}

}
