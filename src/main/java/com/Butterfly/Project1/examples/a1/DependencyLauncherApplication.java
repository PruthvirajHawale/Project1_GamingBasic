package com.Butterfly.Project1.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Added the Component Annotation to the Supercontra game class and useed componentscan to 
// let spring handle the creation of object and autowire it

@Configuration
@ComponentScan
public class DependencyLauncherApplication {
		
	public static void main(String[] args) {
		try( var context = 
				new AnnotationConfigApplicationContext(
						DependencyLauncherApplication.class);){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}