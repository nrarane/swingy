package za.co.wethinkcode.swingy.view;

import za.co.wethinkcode.swingy.model.character.Hero;

import javax.swing.text.Position;
import java.awt.*;
import java.util.ArrayList;
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

            if (chose == 1) {
                System.out.println();
                Point heroPos = new Point(5 / 2, 5 / 2);

                String[][] board = new String[5][5];
                ArrayList<Point> points = initEnemy(board);
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        drawGrid(board, i, j);
                        for (Point point : points) {
                            board[point.x][point.y] = "E";
                        }
                        movePlayer("", heroPos, board);
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println();
                while ((heroPos.x > -1 && heroPos.x < 5) && (heroPos.y > -1 && heroPos.y < 5)) {

                    System.out.print("\nA: Left\nS: Down\nD: Right\nW: Up\n\n1: QuitSave\n2: Quit\n\nYour move: ");

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
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            drawGrid(board, i, j);
                            movePlayer(moveDirection, heroPos, board);
                            for (Point point : points) {
                                board[point.x][point.y] = "E";
                                if (heroPos.x == point.x) {
                                    if (heroPos.y == point.y) {
                                        String ANSI_RESET = "\u001B[0m";
                                        String ANSI_RED = "\u001B[31m";
                                        board[heroPos.x][heroPos.y] = ANSI_RED + "W" + ANSI_RESET;
                                    }
                                }
                            }
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }
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

    public void battleResult() {
    }

    public void drawGrid(String[][] board, int i, int j) {
        board[i][j] = ".";
    }

    public void movePlayer(String direction, Point heroPos, String[][] board)  {
        board[heroPos.x][heroPos.y] = "H";
    }

    public ArrayList<Point> initEnemy(String[][] board)  {

        ArrayList<Point> points = new ArrayList<Point>();
        Point randomPoint;
        Point initHeroPoint = new Point((int) 5/2, (int) 5/2);
        int k = 0;
        while (k < 5) {
            randomPoint = randXYPoint();
            if (!randomPoint.equals(initHeroPoint)) {
//                System.out.println((randomPoint.equals(initHeroPoint)));

                points.add(randomPoint);

            } else {
                continue;
            }
            k++;
        }

        for ( Point point : points ) {
            board[point.x][point.y] = "E";
        }
        
        return points;

    }

    public Point randXYPoint(){
        int min = 0;
        int max = 5;

        double xValue = min + Math.random() * (max - min);
        double yValue = min + Math.random() * (max - min);
        return new Point((int) xValue, (int) yValue);
    }

}
