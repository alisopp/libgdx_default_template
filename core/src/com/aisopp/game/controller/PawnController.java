package com.aisopp.game.controller;

import com.aisopp.game.InputHandler;

/**
 * @author AIsopp
 * @version 1.0
 * @since 15.03.2018
 */

public interface PawnController {

    public InputHandler getInputHandler();
    public void setInputHandler(InputHandler inputHandler);
}
