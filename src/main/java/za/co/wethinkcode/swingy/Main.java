package za.co.wethinkcode.swingy;

import za.co.wethinkcode.swingy.controller.GameManager;

import static za.co.wethinkcode.swingy.EnumInterfaceType.GUI;

public class Main {

    public static void main(String args[]) {

        if (args.length == 1) {
            EnumInterfaceType selectedInterface = getInterfaceType(args[0].toUpperCase());

            GameManager gameController = new GameManager();
            gameController.initGame(selectedInterface);
        }
        System.out.println("You can only pass in 1 argument");
        return;

    }

    private static EnumInterfaceType getInterfaceType(String args) {
        if (args.equals("CLI")) {
            return EnumInterfaceType.CLI;
        } else if (args.equals("GUI")) {
            return EnumInterfaceType.GUI;
        } else {
            System.out.println("Interface can only be console or GUI");
            System.exit(0);
        }
        return null;
    }

}
