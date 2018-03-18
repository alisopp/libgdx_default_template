package com.aisopp.game.ashley.systems;

import com.aisopp.game.ashley.components.TransformComponent;
import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;

/**
 * @author AIsopp
 * @version 1.0
 * @since 16.03.2018
 */

public class MovementSystem extends IteratingSystem {

    protected ComponentMapper<TransformComponent> mTransformComponent;

    public MovementSystem() {
        super(Family.all(TransformComponent.class).get());
        mTransformComponent = ComponentMapper.getFor(TransformComponent.class);


    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {

    }
}
