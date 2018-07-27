package za.co.wethinkcode.swingy.controller;

public interface GameController {

    void moveSouth();

    void moveNorth();

    void moveEast();

    void moveWest();

    void controlPlayer( String heroName );

    void attack();

    void run();

}
