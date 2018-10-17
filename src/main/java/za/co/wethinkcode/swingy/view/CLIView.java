package za.co.wethinkcode.swingy.view;

import za.co.wethinkcode.swingy.model.character.Hero;

import javax.swing.text.Position;
import java.util.Scanner;

public class CLIView {

    public CLIView() {

        Hero hero = new Hero("lol", 1, 0, 2, 10, 3, 0);
        Hero hero2 = new Hero("lol1", 1, 0, 2, 10, 0, 0);
        Hero hero3 = new Hero("lol2", 1, 0, 3, 10, 1, 0);

        System.out.println("************************************");
        System.out.println("*        Welcome to swingy!        *");
        System.out.println("*       Show us what you got       *");
        System.out.println("*              Created by: nrarane *");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("What would you like to do?\n");
        System.out.println("1. New Game\n2. Load Game\n3. Exit\n");

        System.out.print("Your option: ");
        Scanner input = new Scanner(System.in);

        int option = input.nextInt();

        if (option == 1) {

             Scanner inputPlayerName;
             String playerName;
             do {

                 System.out.print("Enter your name:");
                 inputPlayerName = new Scanner(System.in);
                 playerName = inputPlayerName.next();

                 if (playerName.isEmpty() || playerName.length() < 3)
                    System.out.println("Your name needs to have atleast 3 characters");

             } while (playerName.isEmpty() || playerName.length() < 3);

            System.out.println("Please select your hero\n");

            System.out.println("1. " + hero.name);
            System.out.println("2. " + hero2.name);
            System.out.println("3. " + hero3.name);
            System.out.println("");
            System.out.print("Your hero: ");

            Scanner characterInput = new Scanner(System.in);
            int character = characterInput.nextInt();

        } else if (option == 2) {
            System.out.print("You chose to load a game");
        } if (option == 3) {
            System.exit(0);
        }
    }

}
