package com.aisopp.game.util;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

/**
 * @author AIsopp
 * @version 1.0
 * @since 18.03.2018
 */

public class VectorMath {


    public static Vector2 add(Vector2 v, Vector2 v2) {
        Vector2 vector2 = new Vector2(v);
        vector2.add(v2);
        return vector2;
    }


    public static Vector2 sub(Vector2 v, Vector2 v2) {
        float x1 = Math.round(v.x *10) /10f;
        float y1 = Math.round(v.y *10) /10f;

        float x2 = Math.round(v2.x *10) /10f;
        float y2 = Math.round(v2.y *10) /10f;

        return new Vector2(x1 -x2,y1 - y2);
    }


    public static Vector2 scl(Vector2 v, float scalar) {
        Vector2 vector2 = new Vector2(v);
        vector2.scl(scalar);
        return vector2;
    }

    public static Vector2 nor(Vector2 v) {
        Vector2 vector2 = new Vector2(v);
        vector2.nor();
        return vector2;
    }
}
