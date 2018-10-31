package za.co.wethinkcode.swingy.model;

import javafx.geometry.Pos;
import za.co.wethinkcode.swingy.EDirection;
import za.co.wethinkcode.swingy.model.character.Player;
import za.co.wethinkcode.swingy.util.MapSize;

import java.awt.*;
import java.util.HashMap;

public class Map {

    Point mapPoint = null;
    String[][] drawMap = new String[MapSize.mapSize(1)][MapSize.mapSize(1)];

    public Map() {
        for (int i = 1; i < MapSize.mapSize(1); i++) {
            for (int j = 1; j < MapSize.mapSize(1); j++) {
                mapPoint.x = i;
                mapPoint.y = j;
                drawMap[mapPoint.x][mapPoint.y] = ".";
            }
        }
    }
}
