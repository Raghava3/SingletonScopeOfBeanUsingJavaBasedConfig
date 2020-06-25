package com.raghava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {

	/*
	 * this is java based configuration
	 */
	
	@Bean
	@Scope(value = "singleton")
	public HelloWorld helloWorld()
	{
		return new HelloWorld();
	}
	
}
