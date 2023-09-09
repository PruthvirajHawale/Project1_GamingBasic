package com.Butterfly.Project1.Helloworld;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 1: Launch a Spring Context
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
		 // 2: Configure the things that we want spring to manage
		       //HelloWorldConfiguration - @Configuration
		 	   //name - @Bean
		 
		 //3. Retrieving Beans managed by Spring
		  	 System.out.println(context.getBean("person3Parameter1"));
		  	 System.out.println(context.getBean(Address.class));
		  	 
		  	 Arrays.stream(context.getBeanDefinitionNames()).forEach(x -> System.out.print(x));
		}
		  	 
		

	}
}
