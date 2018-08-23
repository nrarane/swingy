package za.co.wethinkcode.swingy;

import za.co.wethinkcode.swingy.controller.GameManager;

public class Main {


    public static void main(String args[]) {
        GameManager gameManager = new GameManager();
        EnumInterfaceType interfaceType = getInterfaceType(args);
        gameManager.initGame(interfaceType);
    }

    private static EnumInterfaceType getInterfaceType(String[] args) {
        //Write Logic to get the interface type
        return EnumInterfaceType.GUI;
    }
}
