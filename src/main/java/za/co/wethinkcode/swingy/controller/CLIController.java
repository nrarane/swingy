package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.EHeroClass;
import za.co.wethinkcode.swingy.model.character.Player;
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

        cliView.userNameRequest();
        String profileName = scanner.next();


        arenaController.setArena(this.arenaController.getArena());
        PlayerFactory playerFactory = new PlayerFactory(arenaController, profileName);
        try {
            String choice;
            boolean valdInput = false;
            boolean classSelected = false;

            while (!valdInput){
                cliView.newHeroSelectionScreen();
                choice = scanner.next();
                if (parseInt(choice) >= 1 && parseInt(choice) <= 3) {
                    classSelected = heroClassSelection(choice);
                    valdInput = true;
                } else {
                    System.out.println("Select 1 of the above options");
                    continue;
                }
            }

            if (classSelected){
                String heroStats = arenaController.getArena().getHero().toString();
                cliView.showHeroStats(heroStats);
                System.out.print("\ncontinue(y/n): ");
            }

            choice = scanner.next();
            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                loadStage();
            } else {
                showHeroSelection();
            }


        } catch (NumberFormatException e) {
            System.out.println("\nPlease select 1 of the above options\n");
            showHeroSelection();
        }
    }

    private boolean heroClassSelection(String choice) {
        if (choice.equals("1")) {
            arenaController.getArena().getHero().setEheroclass(EHeroClass.Contractor);
            return true;
        } else if  (choice.equals("2")) {
            arenaController.getArena().getHero().setEheroclass(EHeroClass.DC);
            return true;
        } else if (choice.equals("3")) {
            arenaController.getArena().getHero().setEheroclass(EHeroClass.Marvel);
            return true;
        }
        return false;
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
        while (!arenaController.getArena().isGameOver) {
            cliView.printMap(arenaController.getArena());
            movePlayer();
        }
    }

    private void movePlayer() {

        cliView.moveKeys();

        Point position = arenaController.getArena().getHero().getPoint();
        int mapSize = arenaController.getArena().getMap().getSize();
        int posX = position.x;
        int posY = position.y;
        Player hero = (Player) arenaController.getArena().getHero();

        if ((posX < mapSize && posX > 0) && (posY < mapSize && posY > 0)){
            arenaController.getArena().getHero().setPoint(updatePosition(position));
//            arenaController.getArena().map.setMapPoints(position, hero);
        }
    }

    private Point updatePosition(Point position) {
        String moveDir = scanner.next();

        if (moveDir.equalsIgnoreCase("A")){
            position.y--;
        } else if (moveDir.equalsIgnoreCase("D")){
            position.y++;
        } else if (moveDir.equalsIgnoreCase("W")){
            position.x--;
        } else if (moveDir.equalsIgnoreCase("S")){
            position.x++;
        } else {
            cliView.keyNotKnown();
            movePlayer();
        }
        return position;
    }

}
