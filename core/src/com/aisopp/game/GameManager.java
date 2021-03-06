package com.aisopp.game;

import com.aisopp.game.ashley.components.MovementComponent;
import com.aisopp.game.ashley.engine.MyEngine;
import com.aisopp.game.ashley.entity.Player;
import com.aisopp.game.ashley.systems.MovementSystem;
import com.aisopp.game.ashley.systems.RenderSystem;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import java.util.HashMap;

/**
 * @author AIsopp
 * @version 1.0
 * @since 15.03.2018
 */
public class GameManager implements InputHandler{

    public long lastID = 0;

    private HashMap<Long, Entity> units;

    private SpawnerImpl spawner;
    private MyEngine engine;
    private Camera camera;

    public GameManager() {
        units = new HashMap<Long, Entity>();
        spawner = new SpawnerImpl();
        createEngine();
        createPlayer();
    }

    public void createPlayer(){
        Player player = new Player();
        engine.addEntity(player);
        units.put(lastID, player);
        lastID++;
    }


    private void createEngine(){
        engine = new MyEngine();
        //Add some logic

        engine.addSystem(new MovementSystem());
        //Renderer should be the last system to add
        RenderSystem renderSystem = new RenderSystem();
        engine.addSystem(renderSystem);
        camera = renderSystem.getCamera();
    }

    public void render(){
        engine.update(Gdx.graphics.getDeltaTime());
    }



    public void dispose(){
        engine.dispose();
    }


    @Override
    public void sendTouchInput(Vector2 screenCoordinates, long entityID) {
        Entity entity = units.get(entityID);
        Vector3 withZCoordinate = new Vector3(screenCoordinates, 0);
        Vector3 translated = camera.unproject(withZCoordinate);
        Vector2 targetLocation = new Vector2(translated.x,translated.y);
        System.out.println("Hello");
        entity.getComponent(MovementComponent.class).setTargetLocation(targetLocation);
    }
}
