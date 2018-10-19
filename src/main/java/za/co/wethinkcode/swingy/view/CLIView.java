package za.co.wethinkcode.swingy.view;

import za.co.wethinkcode.swingy.model.character.Hero;

import javax.swing.text.Position;
import java.awt.*;
import java.util.Arrays;
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

            Hero[] heroes = {hero, hero2, hero3};
            Hero heroSelected = heroes[character - 1];

            System.out.println("name: " + heroSelected.name + "\n" +
                    "attack: " + heroSelected.attack + "\n" +
                    "hp: " + heroSelected.hitPoints + "\n" +
                    "xp: " + heroSelected.experience + "\n" +
                    "defence: " + heroSelected.defence );

            System.out.println("1. Continue\n2. Back\n3. Exit");

            Scanner choice = new Scanner(System.in);
            int chose = choice.nextInt();

            String[][] gridd = new String[5][5];

            if ( chose == 1 ) {
                for (int i = 0; i < 5/*mapSize*/; i++ ) {
                    for (int j = 0; j < 5/*mapSize*/; j++) {
                        gridd[i][j] = "*";
                        System.out.print(gridd[i][j] + " ");
                    }
                    System.out.println("");
                }
            }

            System.out.println("");
            Point heroPos = new Point(5/2, 5/2);

            for (int i = 0; i < 5/*mapSize*/; i++ ) {
                for (int j = 0; j < 5/*mapSize*/; j++) {
                    gridd[i][j] = "*";
                    gridd[heroPos.x][heroPos.y] = "H";
                    System.out.print(gridd[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("");

            System.out.println("A: Left\tS: Down\tD: Right\tW: Up\nmove: ");

            Scanner moveHero = new Scanner(System.in);
            String moveDirection = moveHero.next();
            int quitSave = moveHero.nextInt();

            switch (moveDirection) {
                case "W":
                case "w":
                    heroPos.y = heroPos.y - 1;
                    break;
                case "A":
                case "a":
                    heroPos.x = heroPos.x - 1;
                    break;
                case "S":
                case "s":
                    heroPos.y = heroPos.y + 1;
                    break;
                case "D":
                case "d":
                    heroPos.x = heroPos.x + 1;
                    break;
                default:
                    break;
            }

            if (quitSave == 1) {
                System.out.println("you have gone to previous screen");
            } else if (quitSave == 2) {
                System.exit(0);
            }

        } else if (option == 2) {

            System.out.print("You chose to load a game");

        } else if (option == 3) {

            System.exit(0);

        }

    }

}
