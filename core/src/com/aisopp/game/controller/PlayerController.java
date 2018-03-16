package com.aisopp.game.controller;

import com.aisopp.game.InputHandler;
import com.badlogic.gdx.InputProcessor;

/**
 * @author AIsopp
 * @version 1.0
 * @since 15.03.2018
 */

public class PlayerController implements PawnController, InputProcessor {

    private InputHandler inputHandler;

    @Override
    public boolean keyDown(int keycode) {
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

    @Override
    public InputHandler getInputHandler() {
        return inputHandler;
    }

    @Override
    public void setInputHandler(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }
}
