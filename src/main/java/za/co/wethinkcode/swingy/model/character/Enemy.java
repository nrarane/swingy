package za.co.wethinkcode.swingy.model.character;

import lombok.Getter;
import lombok.Setter;

import javax.swing.text.Position;
import java.awt.*;

@Getter
@Setter
public class Enemy extends Player {

    private String winningMessage;
    private String losingMessage;

    public Enemy(String name, int level, int experience, int attack, int hitPoints, int defence, Point position) {
        super(name, level, experience, attack, defence, hitPoints, position);
    }

}
