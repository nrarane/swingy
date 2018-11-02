package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIController extends InterfaceController {
    GUIView guiView = new GUIView();;

    @Override
    public void startGame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                showHomeScreen();
            }
        });
    }

    @Override
    public void showHeroSelection() {
        HeroSelectionScreenPanel heroSelectionScreenPanel = new HeroSelectionScreenPanel();
        HeroSelectionScreenController heroSelectionScreenController
                = new HeroSelectionScreenController(this, heroSelectionScreenPanel);
        switchPanelInMainWindow(heroSelectionScreenPanel);
    }

    @Override
    public void loadPreviousGame() {
        ConfirmPreviousGameScreenPanel confirmPreviousGameScreenPanel = new ConfirmPreviousGameScreenPanel();
        switchPanelInMainWindow(confirmPreviousGameScreenPanel);
    }

    @Override
    public void showHomeScreen() {
        HomeScreenPanel homeScreenPanel = new HomeScreenPanel();
        HomeScreenController homeScreenController
                = new HomeScreenController(this, homeScreenPanel);
        switchPanelInMainWindow(homeScreenPanel);
    }

    @Override
    public void loadStage() {
        HeroSelectionScreenPanel heroSelectionScreenPanel = new HeroSelectionScreenPanel();
        HeroSelectionScreenController heroSelectionScreenController
                = new HeroSelectionScreenController(this, heroSelectionScreenPanel);
        ShowStageScreenPanel showStageScreenPanel = new ShowStageScreenPanel();
        switchPanelInMainWindow(showStageScreenPanel);
    }

    private void switchPanelInMainWindow(JPanel panel) {
        guiView.switchPanel(panel);
    }

}
