package za.co.wethinkcode.swingy.controller;

import lombok.Getter;
import lombok.Setter;
import za.co.wethinkcode.swingy.model.Arena;

@Getter @Setter
public class ArenaController {

    Arena arena;

    public ArenaController(Arena arena) {
        this.arena = arena;
    }



}
