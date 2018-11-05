package za.co.wethinkcode.swingy.model;

import lombok.Getter;
import lombok.Setter;
import za.co.wethinkcode.swingy.model.character.Player;

import java.awt.*;
import java.util.HashMap;

@Getter
@Setter
public class Map {

    HashMap<Point, Player> map;
    private int size = 0;

    public Map() {
        this.size = 0;
        map = new HashMap<>();
    }

}
