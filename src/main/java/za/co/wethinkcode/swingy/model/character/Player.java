package za.co.wethinkcode.swingy.model.character;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.awt.*;

@Getter @Setter
public abstract class Player {

    protected String name;
    protected int level;
    protected int experience;
    protected int attack;
    protected int defence;
    protected int hitPoints;
    protected Point point;
    protected boolean inFight;

    public Player(String name, int level, int experience, int attack, int defence, int hitPoints, Point point) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defence = defence;
        this.hitPoints = hitPoints;
        this.point = point;
        this.inFight = false;
    }

    protected Player() {
    }

}
