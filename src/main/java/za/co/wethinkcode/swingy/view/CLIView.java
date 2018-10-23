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
        System.out.println("************************************\n");

        System.out.println("What would you like to do?\n");
        System.out.println("1. New Game\n2. Load Game\n3. Exit\n");

        System.out.print("Your option: ");
        Scanner input = new Scanner(System.in);

        int option = input.nextInt();

        if (option == 1) {

             Scanner inputPlayerName;
             String playerName;
             do {

                 System.out.print("Enter your name: ");
                 inputPlayerName = new Scanner(System.in);
                 playerName = inputPlayerName.next();

                 if (playerName.isEmpty() || playerName.length() < 3)
                    System.out.println("Your name needs to have atleast 3 characters");

             } while (playerName.isEmpty() || playerName.length() < 3);

            System.out.println("Please select your hero\n");

            System.out.println("1. " + hero.name);
            System.out.println("2. " + hero2.name);
            System.out.println("3. " + hero3.name);
            System.out.println();
            System.out.print("Your hero: ");

            Scanner characterInput = new Scanner(System.in);
            int character = characterInput.nextInt();

            Hero[] heroes = {hero, hero2, hero3};
            Hero heroSelected = heroes[character - 1];

            System.out.println( "name:    " + heroSelected.name + "\n" +
                    "attack:  " + heroSelected.attack + "\n" +
                    "hp:      " + heroSelected.hitPoints + "\n" +
                    "xp:      " + heroSelected.experience + "\n" +
                    "defence: " + heroSelected.defence + "\n" );

            System.out.println("1. Continue\n2. Back\n3. Exit\n");

            Scanner choice = new Scanner(System.in);
            System.out.print("Your option: ");
            int chose = choice.nextInt();

            System.out.println();

            if (chose == 1) {
                Point heroPos = new Point(5 / 2, 5 / 2);
                for (int i = 0; i < 5; i++) {
                    Point enemyPos = randXYPoint();
                }

                movePlayer("", heroPos);

                System.out.println();
                while ((heroPos.x > -1 && heroPos.x < 5) && (heroPos.y > -1 && heroPos.y < 5)) {

                    System.out.print("A: Left\nS: Down\nD: Right\nW: Up\n\n1: QuitSave\n2: Quit\n\nYour move: ");

                    Scanner moveHero = new Scanner(System.in);
                    String moveDirection = null;
                    int quitSave = 0;

                    if (moveHero.hasNextBigInteger()) {
                        quitSave = moveHero.nextInt();

                        if (quitSave == 1) {
                            System.out.println("you have gone to previous screen");
                        } else if (quitSave == 2) {
                            System.exit(0);
                        }
                    } else if (moveHero.hasNext()) {
                        moveDirection = moveHero.next();

                        switch (moveDirection.toUpperCase()) {
                            case "W":
                                heroPos.x = heroPos.x - 1;
                                break;
                            case "A":
                                heroPos.y = heroPos.y - 1;
                                break;
                            case "S":
                                heroPos.x = heroPos.x + 1;
                                break;
                            case "D":
                                heroPos.y = heroPos.y + 1;
                                break;
                            default:
                                break;
                        }

                    }
                    if ((heroPos.x == -1 || heroPos.x == 5) || (heroPos.y == -1 || heroPos.y == 5)) {
                        System.out.println("Change stage. \nIncrease level(dependent on the hp accumulated)\n");
                        break;
                    }
                    movePlayer(moveDirection, heroPos);

                }

            } else if (chose == 2) {
                System.out.println("HERE WE SHOULD DISPLAY PREVIOUS OPTIONS");
                System.exit(0);
            } else if (chose == 3) {
                System.exit(0);
            } else {
                System.exit(0);
            }

        } else if (option == 2) {

            System.out.print("You chose to load a game");

        } else if (option == 3) {

            System.exit(0);

        } else {
             System.out.println("You have to select 1 option");
        }

    }

//    public void drawGrid() {
//        String[][] board = new String[5][5];
//
//        for (int i = 0; i < 5/*mapSize*/; i++ ) {
//            for (int j = 0; j < 5/*mapSize*/; j++) {
//                board[i][j] = "*";
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    public void movePlayer(String direction, Point heroPos)  {
        String[][] board = new String[5][5];
        int count = 0;

        for (int i = 0; i < 5/*mapSize*/; i++ ) {
            for (int j = 0; j < 5/*mapSize*/; j++) {
                board[i][j] = "*";
                board[heroPos.x][heroPos.y] = "H";
//                initEnemies(board);
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void initEnemies(String[][] board) {

//        int count = 0;
//        enemyPos = randXYPoint();

        for (int i = 0; i < 5/*mapSize*/; i++ ) {
//            for (int j = 0; j < 5/*mapSize*/; j++) {
            Point enemyPos = randXYPoint();
//            System.out.println(enemyPos);
            board[enemyPos.x][enemyPos.y] = "E";
//            }

        }

    }

    public Point randXYPoint(){
        int min = 1;
        int max = 5;

        double xValue = min + Math.random() * (max - min);
        double yValue = min + Math.random() * (max - min);
        return new Point((int) xValue, (int) yValue);
    }

}
