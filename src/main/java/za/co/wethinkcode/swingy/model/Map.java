package za.co.wethinkcode.swingy.model;

import javafx.geometry.Pos;
import za.co.wethinkcode.swingy.Direction;
import za.co.wethinkcode.swingy.model.character.Player;

import java.util.HashMap;

public class Map {

    public HashMap<Pos, Player> gameMap;

    public Map(int size) {
    }

    public boolean addPlayer() {
        return false;
    }

    public boolean removePlayer() {
        return false;
    }

    public boolean movePlayer(Direction direction) {
        return true;
    }
}
