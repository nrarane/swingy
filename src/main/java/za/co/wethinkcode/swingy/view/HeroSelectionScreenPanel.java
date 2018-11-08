package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroSelectionScreenPanel extends JPanel {
    JLabel label = new JLabel("Name: ");
    JTextField inputName = new JTextField(15);
    public String buttonName[] = {"HERO 1", "HERO 2", "HERO 73"};
    public JButton heroBtn[] = new JButton[3];

//    JButton heroOne = new JButton("Hero 1");
//    JButton heroTwo = new JButton("Hero 2");
//    JButton heroThree = new JButton("Hero 3");

    JButton previousScr = new JButton("Previous Screen");
    JButton startGame = new JButton("Start Game");
    public final JTextArea heroInfo = new JTextArea(10, 80);


    public HeroSelectionScreenPanel() {
        setBackground(Color.DARK_GRAY);

        add(label);
        add(inputName);

        for (int i = 0; i < heroBtn.length; i++) {
            heroBtn[i] = new JButton(buttonName[i]);
            add(heroBtn[i]);
        }

        add(heroInfo);
        add(startGame);
        add(previousScr);

    }

    public void previousScreenActionListener(ActionListener btn) {
        previousScr.addActionListener(btn);
    }

    public void showHeroInfoActionListener(ActionListener e) {
        for (int i = 0; i < heroBtn.length; i++) {

            heroBtn[i].addActionListener(e);

        }
    }

    public void startGameActionListener(ActionListener startGame) {
        this.startGame.addActionListener(startGame);
    }

}
