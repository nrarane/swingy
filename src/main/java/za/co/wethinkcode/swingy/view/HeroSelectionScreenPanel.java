package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class HeroSelectionScreenPanel extends JPanel {
    JLabel label = new JLabel("Name: ");
    JTextField inputName = new JTextField(15);
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

//        String pt1 = "<html><body width='";
//        String pt2 =
//                "'><h1>Label Width</h1>" +
//                        "<p>Many Swing components support HTML 3.2 &amp;" +
//                        " (simple) CSS.  By setting a body width we can cause the " +
//                        " component to find the natural height needed to display" +
//                        " the component.<br><br>" +
//                        "<p>The body width in this text is set to " +
//                        "";
//        String pt3 = " pixels.";
//
//        int width = 175;
//        String s = pt1 + width + pt2 + width + pt3 ;
//
//        JOptionPane.showMessageDialog(null, s);

    }

    public void previousScreenActionListener(ActionListener btn) {
        previousScr.addActionListener(btn);
    }

    public void showHeroInfoActionListener(ActionListener showHeroInfo) {
        heroOne.addActionListener(showHeroInfo);
    }
}
