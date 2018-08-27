package gui.start;

import gui.Collector;
import gui.child.ChildPlace;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class StartPresenter implements Initializable {
    @FXML
    private Label label;

    @FXML
    private void clicked() {
        label.setText(Collector.child.textfield.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new ChildPlace().start();
    }
}
