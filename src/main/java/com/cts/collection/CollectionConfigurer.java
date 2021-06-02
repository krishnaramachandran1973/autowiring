package com.cts.collection;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.cts.collection" })
public class CollectionConfigurer {

	@Bean
	public List<Person> persons() {
		return Arrays.asList(new Person("Krishna", "Ramachandran"), new Person("Deepa", "S"));
	}

}
