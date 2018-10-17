package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.EnumInterfaceType;

public class GameManager {
    public void initGame(EnumInterfaceType interfaceType) {
        interfaceType = EnumInterfaceType.CLI;
        if (interfaceType == EnumInterfaceType.GUI) {
            GUIController controller = new GUIController();
            controller.startGame();
        } else if (interfaceType == EnumInterfaceType.CLI) {
            CLIController controller = new CLIController();
            controller.startGame();
        }
    }
}
