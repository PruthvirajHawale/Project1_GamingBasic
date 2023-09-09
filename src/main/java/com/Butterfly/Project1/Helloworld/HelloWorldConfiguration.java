package com.Butterfly.Project1.Helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record Person(String name, int age) {};
record Address(String Street, int pincode) {};
record Person(String name,int age, Address address) {};

//configuration class
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Pruthvi";
	}
	
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		return new Person("Shubham",24,address());
	}
	@Bean
	public Person person2MethodCall1() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	@Primary
	public Person person3Parameter1(String name, int age, @Qualifier("AddressQualifier") Address address3) {
		return new Person(name,age,address3);
	}
	
	@Bean
	@Primary
	public Address address() {
		return new Address("Alandi",123);
	}
	
	
	@Bean
	public Address address1() {
		return new Address("Tingre nagar",234);
	}
	
	@Bean
	@Qualifier("AddressQualifier")
	public Address address3() {
		return new Address("Tingre nagar",234);
	}
	
	
}
