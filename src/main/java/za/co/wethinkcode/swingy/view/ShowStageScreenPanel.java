package za.co.wethinkcode.swingy.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;

public class ShowStageScreenPanel extends JPanel implements KeyListener,ActionListener {

    ////////
    JTextArea displayArea;
    JTextField typingArea;
    static final String newline = System.getProperty("line.separator");
    ////////



    //draw grid layout for the stage
    int lvl = 1;
    int dimension = 0;
    int sizeOfSq = 0;

    private Point playerStartPt;
    int heightOfScreen = GUIView.mainWndow.getHeight() - 25;

    public void paint(Graphics g, Point currPosition) {

        levelUp(2451);
        System.out.print(lvl);
        sizeOfSq = (int) Math.floor( heightOfScreen / gridSize(lvl));

        int initColumn = gridSize(lvl) / 2;
        int initRow = gridSize(lvl) / 2;

        playerStartPt = new Point(initColumn, initRow);

        for (int x = 0; x < gridSize(lvl); x += 1)
            for (int y = 0; y < gridSize(lvl); y += 1)
                g.drawRect(x * sizeOfSq, y * sizeOfSq, sizeOfSq,sizeOfSq);

        g.fillRect(initColumn * sizeOfSq, initRow * sizeOfSq, sizeOfSq, sizeOfSq);

    }
    /////draws grid layout for the stage end

    /////level up formula
    public int levelUp(int pts) {
        double xp;
        xp = this.lvl * 1000 + Math.pow((this.lvl - 1), 2) * 450;
        while (xp < pts) {
            this.lvl++;
            xp = this.lvl * 1000 + Math.pow((this.lvl - 1), 2) * 450;
        }
        return this.lvl;
    }
    /////leveling up done
    /////determine grid size
    private int gridSize(int lvl) {
        dimension = (lvl - 1) * 5 + 10 - (lvl % 2);
        return  dimension;
    }
    /////grid size done

    //constructor
    public ShowStageScreenPanel() {


        this.setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());

        typingArea = new JTextField(20);
        typingArea.addKeyListener(this);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
//        scrollPane.setPreferredSize(new Dimension(375, 125));

        textPanel.add(typingArea, BorderLayout.PAGE_START);
        textPanel.add(scrollPane, BorderLayout.CENTER);

        this.add(textPanel, BorderLayout.EAST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Clear the text components.
        displayArea.setText("");
        typingArea.setText("");

        //Return the focus to the typing area.
        typingArea.requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        displayInfo(e, "KEY TYPED: ");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        displayInfo(e, "KEY PRESSED: ");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        displayInfo(e, "KEY RELEASED: ");
    }

    private void displayInfo(KeyEvent e, String s) {
        int id = e.getID();
        String keyString;
        if (id == KeyEvent.KEY_TYPED) {
            char c = e.getKeyChar();
            keyString = "key character = '" + c + "'";
        } else {
            int keyCode = e.getKeyCode();
            keyString = "key code = " + keyCode
                    + " ("
                    + KeyEvent.getKeyText(keyCode)
                    + ")";
        }

        displayArea.append(s + newline
                + "    " + keyString + newline);
        displayArea.setCaretPosition(displayArea.getDocument().getLength());
    }

}
