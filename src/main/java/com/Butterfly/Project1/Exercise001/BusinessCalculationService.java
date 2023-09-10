package com.Butterfly.Project1.Exercise001;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;




@Component
@Lazy
class A{
	
}

@Component
class B{
	A a;
	
	public B(A a) {
		System.out.println("Bean Initialized ....... ");
		this.a = a;
	}
}

@Configuration
@ComponentScan
public class BusinessCalculationService {
	
	public static void main(String[] args) {
		
		System.out.println("Spring context being created .....");
		try( var context = 
				new AnnotationConfigApplicationContext(
						BusinessCalculationService.class);){
		System.out.println("Spring context Created ");
		
		
			System.out.println(context.getBean(A.class));

		}
	}

}