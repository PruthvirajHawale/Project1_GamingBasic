package com.Butterfly.Project1.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


//Added the Component Annotation to the Supercontra game class and useed componentscan to 
// let spring handle the creation of object and autowire it

@ComponentScan("package com.Butterfly.Project1.game")
public class GamerApplicaitonRunner {
		
	public static void main(String[] args) {
		try( var context = 
				new AnnotationConfigApplicationContext(
						GamerApplicaitonRunner.class);){
		context.getBean(GameRunner.class).run();
		}
	}

}