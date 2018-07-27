package za.co.wethinkcode.swingy;

import javax.swing.text.Position;

public class Player {

    public String name;
    public int level;
    public int experience;
    public int attack;
    public int defence;
    public int hitPoints;
    public Position position;
    public Artefact artefact;

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

    public void setArtefact(Artefact artefact) {
        this.artefact = artefact;
    }
}
