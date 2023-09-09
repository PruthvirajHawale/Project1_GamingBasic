package com.Butterfly.Project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.Butterfly.Project1.game.GameRunner;
import com.Butterfly.Project1.game.GamingConsole;
import com.Butterfly.Project1.game.MarioGame;
import com.Butterfly.Project1.game.PacMan;
import com.Butterfly.Project1.game.SuperContra;

//Introduced configuration class and created spring context for the games 
//Creating objects in spring context by self -- need to improve
public class GamerApplicaitonRunner {
	
	@Bean
	public GamingConsole game() {
		return new SuperContra(); //Creating Object by our own
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	public static void main(String[] args) {
		try( var context = 
				new AnnotationConfigApplicationContext(
						GamerApplicaitonRunner.class);){
		context.getBean(GameRunner.class).run();
		}
	}

}