package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.HeroSelectionScreenPanel;
import za.co.wethinkcode.swingy.view.HomeScreenPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroSelectionScreenController {
    HeroSelectionScreenPanel heroSelectionScreenPanel;
    GUIController guiController;

    public HeroSelectionScreenController(GUIController guiController, HeroSelectionScreenPanel heroSelectionScreenPanel) {

        this.heroSelectionScreenPanel = heroSelectionScreenPanel;
        this.guiController = guiController;
        heroSelectionScreenPanel.previousScreenActionListener(btnPreviousScreenListener);
        heroSelectionScreenPanel.showHeroInfoActionListener(showHeroInfo);
        heroSelectionScreenPanel.startGameActionListener(startGame);

    }

    ActionListener btnPreviousScreenListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.showHomeScreen();
        }
    };

    ActionListener showHeroInfo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < heroSelectionScreenPanel.heroBtn.length; i++) {// using for loop to scan buttons
                if (heroSelectionScreenPanel.heroBtn[i] == e.getSource()) { // the button[i] is being pressed
                    heroSelectionScreenPanel.heroInfo.setText(heroSelectionScreenPanel.buttonName[i]); // set text accordingly
                    break;
                }
            }
//            heroSelectionScreenPanel.heroInfo.setText("Hope this will work");
        }
    };

    ActionListener startGame = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.loadStage();
        }
    };
}
