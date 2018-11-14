package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.Player;

import java.awt.*;
import java.util.Random;

public class PlayerFactory {

    public PlayerFactory(ArenaController arenaController, String profileName) {
        createEnemy(arenaController);
        createHero(arenaController, profileName);
    }

    private void createEnemy(ArenaController arenaController) {
        int nbEnemies = arenaController.getArena().getMap().getSize();

        for (int i = 0; i < nbEnemies; i++){
            Enemy enemy = (Enemy) factory(arenaController, "enemy", randomPosition(nbEnemies), "enemy"+i);
            arenaController.getArena().getMap().getMapPoints().put(enemy.getPoint(), enemy);
        }
    }

    private Point randomPosition(int size) {
        Point position = new Point();

        position.x = randomGenerator(size);
        position.y = randomGenerator(size);
        return position;
    }

    private int randomGenerator(int size) {
        Random random = new Random();
        return random.nextInt(size);
    }

    private void createHero(ArenaController arenaController, String profileName) {
//        Point center = arenaController.placeInCenter(arenaController.getArena().getMap().getSize());
        Hero hero = (Hero) factory(arenaController, "hero", arenaController.placeInCenter(arenaController.getArena().getMap().getSize()), profileName);
        arenaController.getArena().getMap().getMapPoints().put(hero.getPoint(), hero);

    }

    private Player factory(ArenaController arenaController,String playerType, Point position, String name) {

        Player player;
        if (playerType.equalsIgnoreCase("enemy"))
            player = arenaController.getArena().getEnemy();
        else{
            player = arenaController.getArena().getHero();
//            ((Hero) player).setEheroclass();
        }
        player.setName(name);
        player.setAttack(1);
        player.setDefence(1);
        player.setHitPoints(10);
        player.setPoint(position);

        return player;
    }



}
