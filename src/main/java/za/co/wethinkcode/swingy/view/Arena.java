package za.co.wethinkcode.swingy.view;

import za.co.wethinkcode.swingy.Enemy;
import za.co.wethinkcode.swingy.Hero;
import za.co.wethinkcode.swingy.Map;
import za.co.wethinkcode.swingy.Player;

import java.util.ArrayList;

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
