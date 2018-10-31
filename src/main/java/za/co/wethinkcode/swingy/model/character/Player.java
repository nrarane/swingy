package za.co.wethinkcode.swingy.model.character;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public abstract class Player {

    protected String name;
    protected int level;
    protected int experience;
    protected int attack;
    protected int defence;
    protected int hitPoints;
    protected Point position;
    protected boolean inFight;

    public Player(String name, int level, int experience, int attack, int defence, int hitPoints, Point position) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defence = defence;
        this.hitPoints = hitPoints;
        this.position = position;
        this.inFight = false;
    }

    protected Player() {
    }

//    public static int getHitPoints() {
//        return hitPoints;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    public void setExperience(int experience) {
//        this.experience = experience;
//    }
//
//    public void setAttack(int attack) {
//        this.attack = attack;
//    }
//
//    public void setDefence(int defence) {
//        this.defence = defence;
//    }
//
//    public static void setHitPoints(int hitPoints) {
//        Player.hitPoints = hitPoints;
//    }
//
//    public void setPosition(int position) {
//        this.position = position;
//    }

}
