package za.co.wethinkcode.swingy.model.character;

import javax.swing.text.Position;

public class Player {

    public String name;
    public int level;
    public int experience;
    public int attack;
    public int defence;
    public int hitPoints;
    public Position position;

    public Player(String name, int level, int experience, int attack, int defence, int hitPoints, Position position) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defence = defence;
        this.hitPoints = hitPoints;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
