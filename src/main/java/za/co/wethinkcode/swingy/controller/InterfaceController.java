package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.*;

import javax.swing.*;

public abstract class InterfaceController {

    public abstract void startGame();

    public abstract void showHeroSelection();

    public abstract void loadPreviousGame();

    public abstract void showHomeScreen();

    public abstract void loadStage();

}
