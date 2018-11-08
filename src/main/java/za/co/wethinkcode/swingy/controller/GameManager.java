package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.EnumInterfaceType;
import za.co.wethinkcode.swingy.model.Arena;
import za.co.wethinkcode.swingy.model.Map;
import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Hero;

import java.awt.*;

public class GameManager {
    public void initGame(EnumInterfaceType interfaceType) {
        Hero hero = new Hero("ll", 1, 1, 1, new Point(1,1));
        Enemy enemy = new Enemy("ene", 1,1 ,1, new Point(5,5));
        Map map = new Map();
        map.setSize(9);
        Arena arena = new Arena(hero,enemy,map);
        ArenaController arenaController = new ArenaController(arena);

        if (interfaceType == EnumInterfaceType.GUI) {
            GUIController controller = new GUIController();
            controller.startGame();
        } else if (interfaceType == EnumInterfaceType.CLI) {
            CLIController controller = new CLIController(arenaController);
            controller.startGame();
        }
    }
}
