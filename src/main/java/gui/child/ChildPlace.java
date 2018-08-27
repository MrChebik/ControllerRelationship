package gui.child;

import gui.PlaceHelper;
import gui.ViewHelper;
import javafx.stage.Modality;
import javafx.stage.Stage;
import screen.measurement.Scale;

public class ChildPlace extends PlaceHelper {
    public void start() {
        super.stage = new Stage();

        initWindow("A B C",
                Modality.APPLICATION_MODAL,
                Scale.PLACE_CHILD,
                ViewHelper.PLACE_CHILD);
    }
}