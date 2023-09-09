package com.Butterfly.Project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Butterfly.Project1.game.GameRunner;
import com.Butterfly.Project1.game.MarioGame;
import com.Butterfly.Project1.game.PacMan;
import com.Butterfly.Project1.game.SuperContra;

public class App01GamingBasicJava {
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
		
		
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContra();
		var pacmanGame = new PacMan();
		// 1: Object creation
		
		var gameRunner = new GameRunner(pacmanGame);
		// 2: Object creation + Wiring of dependency
		// pacmanGame is a Dependency of GameRunner
		
		gameRunner.run();
	}

}