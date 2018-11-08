package za.co.wethinkcode.swingy.model.character;

import lombok.Getter;
import lombok.Setter;
import za.co.wethinkcode.swingy.EHeroClass;

import java.awt.*;

@Getter
@Setter
public class Hero extends Player {

    private static String winningMessage;
    private static String losingMessage;
    protected boolean inFight = false;
    protected int experience = 0;
    protected int level = 1;

    EHeroClass eheroclass;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                "\nhero class=" + eheroclass +
                "\nlevel=" + level +
                "\nexperience=" + experience +
                "\nattack=" + attack +
                "\ndefence=" + defence +
                "\nhitPoints=" + hitPoints +
                '}';
    }

    public Hero(String name, int attack, int hitPoints, int defence, Point position) {
        super(name, attack, defence, hitPoints, position);
    }

}
