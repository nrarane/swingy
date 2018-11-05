package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.model.Arena;
import za.co.wethinkcode.swingy.view.*;

import javax.swing.*;

public abstract class InterfaceController {

    ArenaController arenaController;

    public InterfaceController(ArenaController arenaController) {
        this.arenaController = arenaController;
    }

    public abstract void startGame();

    public abstract void showHeroSelection();

    public abstract void loadPreviousGame();

    public abstract void showHomeScreen();

    public abstract void loadStage();

    public InterfaceController() {}

}
