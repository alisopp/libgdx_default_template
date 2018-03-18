package com.aisopp.game;

import com.aisopp.game.ashley.engine.MyEngine;
import com.aisopp.game.ashley.entity.Player;
import com.aisopp.game.ashley.systems.InputHandlerSystem;
import com.aisopp.game.ashley.systems.MovementSystem;
import com.aisopp.game.ashley.systems.RenderSystem;
import com.aisopp.game.controller.PlayerController;
import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class MyGdxGame extends ApplicationAdapter {
	private MyEngine engine;

	private Array<Entity> units;
	
	@Override
	public void create () {
		engine = new MyEngine();
		units = new Array<Entity>();
		InputHandlerSystem inputHandlerSystem = new InputHandlerSystem();

		//add User input
		engine.addSystem(inputHandlerSystem);
		PlayerController controller = new PlayerController();
		controller.setInputHandler(inputHandlerSystem);

		//Add some logic
		engine.addSystem(new MovementSystem());



		//Renderer should be the last system to add
		engine.addSystem(new RenderSystem());
		Player player = new Player();
		engine.addEntity(player);
	}


	public Entity createNewUnit(int entityCode){
		Entity entity = null;



		if(entity != null){

		}

		return entity;
	}

	@Override
	public void render () {
		engine.update(Gdx.graphics.getDeltaTime());
	}
	
	@Override
	public void dispose () {
		engine.dispose();
	}
}
