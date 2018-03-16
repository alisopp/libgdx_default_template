package com.aisopp.game;

import com.aisopp.game.ashley.engine.MyEngine;
import com.aisopp.game.ashley.entity.Player;
import com.aisopp.game.ashley.systems.RenderSystem;
import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	private MyEngine engine;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		engine = new MyEngine();
		engine.addSystem(new RenderSystem());
		engine.addEntity(new Player());
	}

	@Override
	public void render () {

		engine.update(Gdx.graphics.getDeltaTime());
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		engine.dispose();
	}
}
