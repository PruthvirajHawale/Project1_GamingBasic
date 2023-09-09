package com.Butterfly.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Butterfly.Project1.game.GameRunner;
import com.Butterfly.Project1.game.GamingConsole;
import com.Butterfly.Project1.game.SuperContra;

@Configuration
public class GameConfiguration {

	@Bean
	public GamingConsole game() {
		return new SuperContra(); //Creating Object by our own
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
