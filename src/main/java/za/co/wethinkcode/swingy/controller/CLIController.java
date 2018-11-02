package za.co.wethinkcode.swingy.controller;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.view.CLIView;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CLIController extends InterfaceController {

    CLIView cliView = new CLIView();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void startGame() {

        cliView.welcomeMsg();
        showHomeScreen();
    }

    @Override
    public void showHeroSelection() {

        cliView.newHeroSelectionScreen();
        String choice = scanner.next();

        try {
            if (parseInt(choice) >= 1 && parseInt(choice) <= 3) {
                if (choice.equals("1")) {
                    System.out.println("you selected this guy");
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
            showHomeScreen();
        }

    }

    @Override
    public void loadPreviousGame() {

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
//            e.getMessage();

        }

    }

    @Override
    public void loadStage() {

    }
}
