package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.HomeScreenPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreenController {
    HomeScreenPanel homeScreenPanel;
    GUIController guiController;

    public HomeScreenController(GUIController guiController, HomeScreenPanel homeScreenPanel) {

        this.homeScreenPanel = homeScreenPanel;
        this.guiController = guiController;
        homeScreenPanel.addNewHeroActionListener(btnNewHeroActionListener);
        homeScreenPanel.loadNewHeroActionListener(btnLoadNewGameActionListener);

    }

    ActionListener btnNewHeroActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.showHeroSelection();
        }
    };

    ActionListener btnLoadNewGameActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            guiController.loadPreviousGame();
        }
    };
}
