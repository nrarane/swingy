package za.co.wethinkcode.swingy.controller;
import za.co.wethinkcode.swingy.EHeroClass;
import za.co.wethinkcode.swingy.model.Arena;
import za.co.wethinkcode.swingy.model.Map;
import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.view.CLIView;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CLIController extends InterfaceController {

    CLIView cliView = new CLIView();

    Scanner scanner = new Scanner(System.in);

    public CLIController(ArenaController arenaController) {
        super(arenaController);
    }

    @Override
    public void startGame() {
        cliView.welcomeMsg();
        showHomeScreen();
    }

    @Override
    public void showHeroSelection() {
        cliView.newHeroSelectionScreen();
        String choice = scanner.next();

        Map map = new Map();

        map.setSize(9);

        Arena arena = new Arena(new Hero("lp", 1, 1, 1, 1, 1, new Point(1, 1)),
                new Enemy("lp", 1, 1, 1, 1, 1, new Point(2, 2)),
                map);

        try {
            if (parseInt(choice) >= 1 && parseInt(choice) <= 3) {
                if (choice.equals("1")) {
                    //display info about the hero then ask player to fill their name (min 3 chars)



                    System.out.println("continue(y/n): ");

                    choice = scanner.next();
                    if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                        loadStage();
                    } else {
                        showHeroSelection();
                    }

                } else if  (choice.equals("2")) {
                    System.out.println("you selected this other guy");
                } else if (choice.equals("3")) {
                    System.out.println("wow this guy is dead");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("Select 1 of the above options");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nPlease select 1 of the above options\n");
            showHeroSelection();
        }
    }

    @Override
    public void loadPreviousGame() {
        cliView.loadHeroSelectionScreen();
        String choice = scanner.next();

        try {
            // show previous games on this screen
        } catch (NullPointerException e) {
            System.out.println("Please select 1 of the above options");
            loadPreviousGame();
        }
    }

    @Override
    public void showHomeScreen() {
        cliView.firstScreen();
        String choice = scanner.next();

        try {
            if (parseInt(choice) >= 1 && parseInt(choice) <= 3) {
                if (choice.equals("1")) {
                    showHeroSelection();
                } else if  (choice.equals("2")) {
                    loadPreviousGame();
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("Select 1 of the above options");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please select 1 of the above options");
            showHomeScreen();
        }
    }

    @Override
    public void loadStage() {
        cliView.printMap(arenaController.getArena());
    }

//    public void updateMap() {
//        cliView.printMap();
//    }

    public CLIController() {
        super();
    }
}
