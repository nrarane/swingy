package za.co.wethinkcode.swingy.controller;

import za.co.wethinkcode.swingy.view.CLIView;
import za.co.wethinkcode.swingy.view.GUIView;

import javax.swing.*;

public class CLIController {
    CLIView cliView;

    public void startGame() {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
                cliView = new CLIView();
//                showHomeScreen();
//            }
//        });
    }

}
