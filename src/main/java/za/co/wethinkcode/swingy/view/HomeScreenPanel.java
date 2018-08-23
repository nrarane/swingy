package za.co.wethinkcode.swingy.view;

import za.co.wethinkcode.swingy.controller.GUIController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomeScreenPanel extends JPanel{
    JButton newHero = new JButton("New Game");
    JButton loadBtn = new JButton("Load Game");

    public HomeScreenPanel() {
        setBackground(Color.BLUE);

        add(newHero);
        add(loadBtn);

    }

    public void addNewHeroActionListener(ActionListener btn) {
        newHero.addActionListener(btn);
//        loadBtn.addActionListener(btn);
    }
}
