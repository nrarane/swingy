package za.co.wethinkcode.swingy.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import za.co.wethinkcode.swingy.view.ShowStageScreenPanel;

public class ShowStageScreenController {
    ShowStageScreenPanel showStageScreenPanel;
    GUIController guiController;

    public ShowStageScreenController(GUIController guiController, ShowStageScreenPanel showStageScreenPanel) {
        this.showStageScreenPanel = showStageScreenPanel;
        this.guiController = guiController;
    }


}
