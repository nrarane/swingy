package za.co.wethinkcode.swingy;

import za.co.wethinkcode.swingy.view.Arena;

import java.lang.reflect.Type;

public interface UserInterface {
    Arena area = null;
    public void update();
    public Type registerToArena(Arena arena);
}
