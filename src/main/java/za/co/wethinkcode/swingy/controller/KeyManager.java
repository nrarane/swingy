package za.co.wethinkcode.swingy.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        new KeyManager(e, "PLAYER MOVED: ");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        new KeyManager(e, "PLAYER MOVED: ");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        new KeyManager(e, "PLAYER MOVED: ");
    }

    public KeyManager(KeyEvent e, String keyPressed) {
        int id = e.getID();
        String keyString;

        if (id == KeyEvent.KEY_TYPED) {
            char c = e.getKeyChar();
            keyString = "pressed : '" + c + "'";
        }
    }

}
