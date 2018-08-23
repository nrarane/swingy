package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class HeroSelectionScreenPanel extends JPanel {
    JLabel label = new JLabel("Name: ");
    JTextField inputName = new JTextField();
    JButton heroOne = new JButton("Hero 1");
    JButton heroTwo = new JButton("Hero 2");
    JButton heroThree = new JButton("Hero 3");
    JButton previousScr = new JButton("Previous Screen");

    public HeroSelectionScreenPanel() {
        setBackground(Color.DARK_GRAY);


        add(label);
        add(inputName);
        add(heroOne);
        add(heroTwo);
        add(heroThree);
        add(previousScr);

    }

    public void addNewHeroActionListener(ActionListener btn) {
        previousScr.addActionListener(btn);
    }
}
