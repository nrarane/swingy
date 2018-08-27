package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.ConfirmPreviousGameScreenPanel;
import za.co.wethinkcode.swingy.view.GUIView;
import za.co.wethinkcode.swingy.view.HeroSelectionScreenPanel;
import za.co.wethinkcode.swingy.view.HomeScreenPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIController {
    GUIView guiView;

    public void startGame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                guiView = new GUIView();
                showHomeScreen();
            }
        });
    }

    public void showHeroSelection() {
        HeroSelectionScreenPanel heroSelectionScreenPanel = new HeroSelectionScreenPanel();
        HeroSelectionScreenController heroSelectionScreenController
                = new HeroSelectionScreenController(this, heroSelectionScreenPanel);
        switchPanelInMainWindow(heroSelectionScreenPanel);
    }

    public void loadPreviousGame() {
        ConfirmPreviousGameScreenPanel confirmPreviousGameScreenPanel = new ConfirmPreviousGameScreenPanel();
        switchPanelInMainWindow(confirmPreviousGameScreenPanel);
    }

//    public void showPrevHomeScreen() {
//        HeroSelectionScreenPanel heroSelectionScreenPanel = new HeroSelectionScreenPanel();
//        HeroSelectionScreenController heroSelectionScreenController
//                = new HeroSelectionScreenController(this, heroSelectionScreenPanel);
//        switchPanelInMainWindow(heroSelectionScreenPanel);
//    }

    public void showHomeScreen() {
        HomeScreenPanel homeScreenPanel = new HomeScreenPanel();
        HomeScreenController homeScreenController
                = new HomeScreenController(this, homeScreenPanel);
        switchPanelInMainWindow(homeScreenPanel);
    }

    private void switchPanelInMainWindow(JPanel panel) {
        guiView.switchPanel(panel);
    }

    public void showHeroInfoScreen() {
        HeroSelectionScreenPanel heroSelectionScreenPanel = new HeroSelectionScreenPanel();
        HeroSelectionScreenController heroSelectionScreenController
                = new HeroSelectionScreenController(this, heroSelectionScreenPanel);
        switchPanelInMainWindow(heroSelectionScreenPanel);
    }
    
}
