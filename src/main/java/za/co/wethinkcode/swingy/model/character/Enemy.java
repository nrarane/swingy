package za.co.wethinkcode.swingy.model.character;

import lombok.Getter;
import lombok.Setter;

import javax.swing.text.Position;
import java.awt.*;

@Getter
@Setter
public class Enemy extends Player {

    public Enemy(String name, int attack, int hitPoints, int defence, Point position) {
        super(name, attack, defence, hitPoints, position);
    }

}
