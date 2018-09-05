package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import java.awt.*;

public class ShowStageScreenPanel extends JPanel {
    public ShowStageScreenPanel() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        for (int x = 30; x <= 720; x += 30)
            for (int y = 30; y <= 720; y += 30)
                g.drawRect(x, y, 30,30);
    }
}
