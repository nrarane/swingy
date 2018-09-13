package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import java.awt.*;

public class ShowStageScreenPanel extends JPanel {

    int lvl = 0;
    int width = 0;
    int height = 0;
    int sizeOfSq = 0;

    private Point playerStartPt;

    int heightOfScreen = GUIView.mainWndow.getHeight() - 25;

    public ShowStageScreenPanel() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        height = (lvl - 1) * 5 + 10 - (lvl % 2);
        width = (lvl - 1) * 5 + 10 - (lvl % 2);
        sizeOfSq = (int) Math.floor( heightOfScreen / width);

        int initColumn = width / 2;
        int initRow = height / 2;

        playerStartPt = new Point(initColumn, initRow);

        for (int x = 0; x < width; x += 1)
            for (int y = 0; y < height; y += 1)
                g.drawRect(x * sizeOfSq, y * sizeOfSq, sizeOfSq,sizeOfSq);

        g.fillRect(initColumn * sizeOfSq, initRow * sizeOfSq, sizeOfSq, sizeOfSq);

    }



}
