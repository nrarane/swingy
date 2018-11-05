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
    public boolean inProgress;
    public BattleResult battleResult;

    public Arena(Hero hero, Enemy enemy, Map map, boolean inProgress, BattleResult battleResult) {
        this.hero = hero;
        this.enemy = enemy;
        this.map = map;
        this.inProgress = inProgress;
        this.battleResult = battleResult;
    }

    public BattleResult playerBattle(Player playerOne, Player playerTwo) {
        return null;
        /* @ Needs implementation */
    }

    public BattleResult getBattleResult() {
        return battleResult;
    }

    public Map getMap() {
        return map;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setBattleResult(BattleResult battleResult) {
        this.battleResult = battleResult;
    }

}
