package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.Player;

public class PlayerFactory {

    public PlayerFactory(ArenaController arenaController) {
        createHero(arenaController);
        createEnemy(arenaController);
    }

    private void createEnemy(ArenaController arenaController) {
        int nbEnemies = arenaController.getArena().getMap().getSize();

        for (int i = 0; i < nbEnemies; i++){
            Player enemy = factory(arenaController);
            arenaController.getArena().getMap().getMapPoints().put(enemy.getPoint(), enemy);
        }
    }

    private void createHero(ArenaController arenaController) {
        Hero hero = (Hero) factory(arenaController);

    }

    private Player factory(ArenaController arenaController) {
        Player player = arenaController.getArena().getHero();
        player.setName("ll");
        player.setAttack(1);
        player.setDefence(1);
        player.setHitPoints(10);
        player.setPoint(arenaController.placeInCenter(arenaController.getArena().getMap().getSize()));

        return player;
    }

}
