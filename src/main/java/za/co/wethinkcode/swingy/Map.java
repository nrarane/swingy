package za.co.wethinkcode.swingy;

import javafx.geometry.Pos;

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
