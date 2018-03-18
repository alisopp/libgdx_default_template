package com.aisopp.game.controller;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

/**
 * @author AIsopp
 * @version 1.0
 * @since 15.03.2018
 */
public class PlayerController extends PawnController implements InputProcessor {

    @Override
    public boolean keyDown(int keycode) {

        switch (keycode){
            case Keys.W:
                inputHandler.sendInputCode(1,1);
                break;
            case Keys.A:
                break;
            case Keys.S:
                break;
            case Keys.D:
                break;
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
