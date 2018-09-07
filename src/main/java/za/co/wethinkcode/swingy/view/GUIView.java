package za.co.wethinkcode.swingy.view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class GUIView {

    static JFrame mainWndow = new JFrame();

    public GUIView() {
        mainWndow.setVisible(true);
        mainWndow.setSize(new Dimension(1000, 800));
    }


    public void switchPanel(JPanel panel) {
        mainWndow.setContentPane(panel);
        mainWndow.setVisible(true);
    }

}
