package gui.child;

import gui.Collector;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChildPresenter implements Initializable {
    @FXML
    private TextField textfield;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Collector.target = textfield;
    }
}
