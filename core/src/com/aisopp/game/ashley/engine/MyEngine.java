package com.aisopp.game.ashley.engine;

import com.aisopp.game.ashley.util.DisposeAble;
import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.ashley.utils.ImmutableArray;

/**
 * @author AIsopp
 * @version 1.0
 * @since 15.03.2018
 */

public class MyEngine extends Engine {

    public void dispose(){
        ImmutableArray<EntitySystem> systems = getSystems();
        for (EntitySystem system :
                systems) {
            if(system instanceof DisposeAble){
                ((DisposeAble) system).dispose();
            }
        }
    }
}
