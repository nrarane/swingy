package za.co.wethinkcode.swingy.model.character;

public class Player {

    public String name;
    public int level;
    public int experience;
    public int attack;
    public int defence;
    public static int hitPoints;
    public int position;

    public Player(String name, int level, int experience, int attack, int defence, int hitPoints, int position) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defence = defence;
        this.setHitPoints(hitPoints);
        this.position = position;
    }

    public static int getHitPoints() {
        return hitPoints;
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

    public static void setHitPoints(int hitPoints) {
        Player.hitPoints = hitPoints;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
