package com.Butterfly.Project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Butterfly.Project1.game.GameRunner;
import com.Butterfly.Project1.game.GamingConsole;
import com.Butterfly.Project1.game.MarioGame;
import com.Butterfly.Project1.game.PacMan;
import com.Butterfly.Project1.game.SuperContra;

//Introduced configuration class and created spring context for the games 
//Creating objects in spring context by self -- need to improve
public class App03GamingBasicJava2 {
	public static void main(String[] args) {
		try( var context = 
				new AnnotationConfigApplicationContext(
						GameConfiguration.class);){
		context.getBean(GameRunner.class).run();
		}
	}

}