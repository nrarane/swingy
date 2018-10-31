package za.co.wethinkcode.swingy.model.character;

import lombok.Getter;
import lombok.Setter;
import java.awt.*;

@Getter
@Setter
public class Hero extends Player {

    private static String winningMessage;
    private static String losingMessage;
    protected boolean inFight;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                "\nlevel=" + level +
                "\nexperience=" + experience +
                "\nattack=" + attack +
                "\ndefence=" + defence +
                "\nhitPoints=" + hitPoints +
                '}';
    }

    public Hero(String name, int level, int experience, int attack, int hitPoints, int defence, Point position) {
        super(name, 1, 0, attack, defence, 100, position);
    }

    protected Hero() {
        super();
    }

}
