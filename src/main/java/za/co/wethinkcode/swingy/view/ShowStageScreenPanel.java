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
    int lvl = 0;
    int width = 0;
    int height = 0;
    int sizeOfSq = 0;

    private Point playerStartPt;
    int heightOfScreen = GUIView.mainWndow.getHeight() - 25;

//    public void paint(Graphics g) {
//        height = (lvl - 1) * 5 + 10 - (lvl % 2);
//        width = (lvl - 1) * 5 + 10 - (lvl % 2);
//        sizeOfSq = (int) Math.floor( heightOfScreen / width);
//
//        int initColumn = width / 2;
//        int initRow = height / 2;
//
//        playerStartPt = new Point(initColumn, initRow);
//
//        for (int x = 0; x < width; x += 1)
//            for (int y = 0; y < height; y += 1)
//                g.drawRect(x * sizeOfSq, y * sizeOfSq, sizeOfSq,sizeOfSq);
//
//        g.fillRect(initColumn * sizeOfSq, initRow * sizeOfSq, sizeOfSq, sizeOfSq);
//
//    }
    //////draws grid layout for the stage end
//    JPanel btnPanel = new JPanel();
//    int rows = 5;
//    int cols = 4;
//        btnPanel.setLayout(new GridLayout(rows, cols, GAP, GAP));
//        for (int row = 0; row < texts.length; row++) {
//        for (int col = 0; col < texts[row].length; col++) {
//            JButton btn = new JButton(texts[row][col]);
//            btn.setFont(BTN_FONT);
//            btnPanel.add(btn);
//        }
//    }

    //constructor
    public ShowStageScreenPanel() {

        

        typingArea = new JTextField(20);
        typingArea.addKeyListener(this);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
//        scrollPane.setPreferredSize(new Dimension(375, 125));

        add(typingArea, BorderLayout.PAGE_START);
        add(scrollPane, BorderLayout.CENTER);
    }
//    public static void createAndShowGUI() {
//        //Create and set up the window.
//        ShowStageScreenPanel frame = new ShowStageScreenPanel("Stage lol");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Set up the content pane.
//        frame.addComponentsToPane();
//
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }

//    private void addComponentsToPane() {
//        typingArea = new JTextField(20);
//        typingArea.addKeyListener(this);

//        displayArea = new JTextArea();
//        displayArea.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(displayArea);
//        scrollPane.setPreferredSize(new Dimension(375, 125));

//        add(typingArea, BorderLayout.PAGE_START);
//        add(scrollPane, BorderLayout.CENTER);
//    }

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
        displayInfo(e, "KEY RELEASED: ");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        displayInfo(e, "KEY RELEASED: ");
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
