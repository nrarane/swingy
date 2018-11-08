package za.co.wethinkcode.swingy.model;

import lombok.Getter;
import lombok.Setter;
import za.co.wethinkcode.swingy.model.character.Enemy;
import za.co.wethinkcode.swingy.model.character.Hero;
import za.co.wethinkcode.swingy.model.character.Player;

@Getter @Setter
public class Arena {

    public Hero hero;
    public Enemy enemy;
    public Map map;

    public Arena(Hero hero, Enemy enemy, Map map) {
        this.hero = hero;
        this.enemy = enemy;
        this.map = map;
    }

}
