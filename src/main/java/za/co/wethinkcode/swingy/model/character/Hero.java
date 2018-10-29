package za.co.wethinkcode.swingy.model.character;

import javax.swing.text.Position;

public class Hero extends Player {

    private static String winningMessage;
    private static String losingMessage;

    public Hero(String name, int level, int experience, int attack, int hitPoints, int defence, int position) {
        super(name, level, experience, attack, defence, hitPoints, position);
    }

    public static String getWinningMessage() {
        return winningMessage;
    }

    public static void setWinningMessage(String winningMessage) {
        Hero.winningMessage = winningMessage;
    }

    public static String getLosingMessage() {
        return losingMessage;
    }

    public static void setLosingMessage(String losingMessage) {
        Hero.losingMessage = losingMessage;
    }
}
