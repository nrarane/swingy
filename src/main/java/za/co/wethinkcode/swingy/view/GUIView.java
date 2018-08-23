package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import java.awt.*;

public class GUIView {
    JFrame mainWndow = new JFrame();

    public GUIView() {
        mainWndow.setVisible(true);
        mainWndow.setSize(new Dimension(1000, 800));
    }


    public void switchPanel(JPanel panel) {
        mainWndow.setContentPane(panel);
        mainWndow.setVisible(true);
    }
}
