package za.co.wethinkcode.swingy.controller;

import javafx.geometry.Pos;
import za.co.wethinkcode.swingy.EDirection;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.Player;
import za.co.wethinkcode.swingy.util.MapSize;

import java.awt.*;
import java.util.HashMap;

public class MapController {
    /*public HashMap<Pos, Player> gameMap;*/
//    Hero hero = new Hero();

    public MapController(int size) {
        size = MapSize.mapSize(1);
    }

    public boolean addPlayer() {
        return false;
    }

    public boolean removePlayer() {
        return false;
    }

    public void movePlayer(EDirection direction) {

//        Point heroPos = hero.getPosition();

        switch (direction) {
            case NORTH:
//                heroPos.x = heroPos.x - 1;
                break;
            case EAST:
//                heroPos.y = heroPos.y - 1;
                break;
            case SOUTH:
//                heroPos.x = heroPos.x + 1;
                break;
            case WEST:
//                heroPos.y = heroPos.y + 1;
                break;
            default:
                break;
        }

    }
}
