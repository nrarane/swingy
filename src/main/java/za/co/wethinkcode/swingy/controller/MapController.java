package za.co.wethinkcode.swingy.controller;

import javafx.geometry.Pos;
import za.co.wethinkcode.swingy.EDirection;
import za.co.wethinkcode.swingy.model.character.Player;
import za.co.wethinkcode.swingy.util.MapSize;

import java.util.HashMap;

public class MapController {
    public HashMap<Pos, Player> gameMap;

    public MapController(int size) {
        size = MapSize.mapSize(1);
    }

    public boolean addPlayer() {
        return false;
    }

    public boolean removePlayer() {
        return false;
    }

    public boolean movePlayer(EDirection direction) {

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

        return true;
    }
}
