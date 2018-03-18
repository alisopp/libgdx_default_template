package com.aisopp.game.ashley.entity;

import com.aisopp.game.ashley.components.MovementComponent;
import com.aisopp.game.ashley.components.TextureComponent;
import com.aisopp.game.ashley.components.TransformComponent;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/**
 * @author AIsopp
 * @version 1.0
 * @since 15.03.2018
 */
public class Player extends Entity {

    public Player() {
        TransformComponent transformComponent = new TransformComponent();
        transformComponent.setPosition(new Vector2(5,7.5f));
        TextureComponent textureComponent = new TextureComponent();
        textureComponent.setTexture(new TextureRegion(new Texture("Character.png")));
        MovementComponent movementComponent = new MovementComponent(5,transformComponent);
        add(transformComponent);
        add(textureComponent);
        add(movementComponent);
    }
}
