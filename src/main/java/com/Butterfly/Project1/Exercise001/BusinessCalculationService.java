package com.Butterfly.Project1.Exercise001;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan
public class BusinessCalculationService {
	
	@Autowired
	@Qualifier("main")
	DataService dataService;
	
//	public BusinessCalculationService(DataService dataService) {
//		this.dataService = dataService;
//	}
//	
	public int findmax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
		
	public static void main(String[] args) {
		try( var context = 
				new AnnotationConfigApplicationContext(
						BusinessCalculationService.class);){
		
			System.out.println(context.getBean(BusinessCalculationService.class).findmax());

		}
	}

}