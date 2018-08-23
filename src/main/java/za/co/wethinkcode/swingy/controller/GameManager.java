package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.EnumInterfaceType;

public class GameManager {
    public void initGame(EnumInterfaceType interfaceType) {
        if (interfaceType == EnumInterfaceType.GUI) {
            GUIController controller = new GUIController();
            controller.startGame();
        }
    }
}
