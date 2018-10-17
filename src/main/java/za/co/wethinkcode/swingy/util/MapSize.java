package za.co.wethinkcode.swingy.util;

public class MapSize {

    public int mapSize(int lvl) {
        return (lvl - 1) * 5 + 10 - (lvl % 2);
    }

    public int isNextLevel(int lvl) {
        return (int) (lvl * 1000 + Math.pow((lvl - 1), 2) * 450);
    }

}
