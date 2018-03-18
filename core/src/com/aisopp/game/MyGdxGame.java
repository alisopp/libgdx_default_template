package com.aisopp.game;

import com.aisopp.game.ashley.engine.MyEngine;
import com.aisopp.game.ashley.entity.Player;
import com.aisopp.game.ashley.systems.MovementSystem;
import com.aisopp.game.ashley.systems.RenderSystem;
import com.aisopp.game.controller.PlayerController;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;

public class MyGdxGame extends ApplicationAdapter {



	private GameManager manager;
	
	@Override
	public void create () {
		manager = new GameManager();
		//add User input
		PlayerController controller = new PlayerController();
		controller.setInputHandler(manager);
	}




	@Override
	public void render () {
		manager.render();
	}
	
	@Override
	public void dispose () {
		manager.dispose();
	}
}
