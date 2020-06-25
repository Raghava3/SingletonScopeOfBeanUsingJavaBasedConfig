package com.raghava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args)
	{
		System.out.println("hello");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld a = applicationContext.getBean(HelloWorld.class);
		a.setMessage("this is a object");
		a.getMessage();
		
		HelloWorld b = applicationContext.getBean(HelloWorld.class);
		/*
		 * even though we are setting message of b object, we are getting message from a
		 * object due to singleton scope
		 */
		b.getMessage();
		

		
	}
	
}
