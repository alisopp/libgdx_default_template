package com.aisopp.game;

import com.aisopp.game.ashley.entity.Player;
import com.badlogic.ashley.core.Entity;

/**
 * @author AIsopp
 * @version 1.0
 * @since 18.03.2018
 */

public class SpawnerImpl {
    public static final int SPAWN_PLAYER = 0;


    public Entity createNewUnit(int entityCode) {
        Entity entity = null;

        switch (entityCode) {
            case SPAWN_PLAYER:
                entity = new Player();
                break;
        }

        return entity;
    }
}
