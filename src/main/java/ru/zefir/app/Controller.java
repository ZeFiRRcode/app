package ru.zefir.app;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;


public class Controller {

    @FXML
    private ProgressBar bar;

    @FXML
    private CheckBox check;

    @FXML
    public Pane plane;

    @FXML
   void onHelloButtonClick(ActionEvent event) {
        if (check.isSelected()) {
            bar.setProgress(1);
        }
        else {
            bar.setProgress(0);
        }
    }

}
