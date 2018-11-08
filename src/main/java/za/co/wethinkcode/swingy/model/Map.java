package za.co.wethinkcode.swingy.model;

import lombok.Getter;
import lombok.Setter;
import za.co.wethinkcode.swingy.model.character.Player;

import java.awt.*;
import java.util.HashMap;

@Getter
@Setter
public class Map {

    HashMap<Point, Player> mapPoints;
    private int size;

    public Map() {
        this.size = 0;
        mapPoints = new HashMap<>();
    }

}
