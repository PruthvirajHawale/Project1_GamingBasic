package com.Butterfly.Project1.examples.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
class YourBusinessClass {

	Dependency1 d1;

	Dependency2 d2;


	@Autowired
	public YourBusinessClass(Dependency1 d1, Dependency2 d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	public String toString() {
		System.out.println("Setter Injection - setDependency2 ");
		return "Using " + d1 + " and " + d2 + "Dependencies";
	}

}

@Configuration
class Dependency1 {

}

@Configuration
class Dependency2 {

}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}

}