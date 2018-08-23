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
        heroSelectionScreenPanel.addNewHeroActionListener(btnPreviousScreenListener);

    }

    ActionListener btnPreviousScreenListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.showPrevHomeScreen();
        }
    };
}
