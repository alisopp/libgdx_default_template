package com.aisopp.game.ashley.systems;

import com.aisopp.game.InputHandler;
import com.aisopp.game.ashley.components.TransformComponent;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;

/**
 * @author AIsopp
 * @version 1.0
 * @since 16.03.2018
 */

public class InputHandlerSystem extends IteratingSystem implements InputHandler{


    public InputHandlerSystem() {
        super(Family.all(TransformComponent.class).get());
    }

    @Override
    public void sendInputCode(int entityID, int code) {

    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {

    }
}
