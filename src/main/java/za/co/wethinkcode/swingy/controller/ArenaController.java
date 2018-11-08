package za.co.wethinkcode.swingy.controller;

import lombok.Getter;
import lombok.Setter;
import za.co.wethinkcode.swingy.model.Arena;

import java.awt.*;

@Getter @Setter
public class ArenaController {

    Arena arena;

    public ArenaController(Arena arena) {
        this.arena = arena;
    }

    public Point placeInCenter(int size) {
        int center = size / 2;
        return new Point(center, center);
    }

}
