package com.Butterfly.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Butterfly.Project1.game.SuperContra;

@Configuration
public class GameConfiguration {

	@Bean
	public SuperContra supercontra() {
		return new SuperContra();
	}
}
