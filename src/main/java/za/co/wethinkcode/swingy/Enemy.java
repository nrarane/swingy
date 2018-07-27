package za.co.wethinkcode.swingy;

import javax.swing.text.Position;

public class Enemy extends Player {

    private String winningMessage;
    private String losingMessage;

    public Enemy(String name, int level, int experience, int attack, int hitPoints, int defence, Position position, Artefact artefact) {

    }

    public Enemy() {
    }

    public String getWinningMessage() {
        return winningMessage;
    }

    public void setWinningMessage(String winningMessage) {
        this.winningMessage = winningMessage;
    }

    public String getLosingMessage() {
        return losingMessage;
    }

    public void setLosingMessage(String losingMessage) {
        this.losingMessage = losingMessage;
    }
}
