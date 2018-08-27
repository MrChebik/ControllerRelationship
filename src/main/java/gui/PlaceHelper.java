package gui;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import screen.Screen;
import screen.measurement.Scale;

public abstract class PlaceHelper extends Application {
    protected Stage stage;

    protected void initWindow(String title,
                              Modality modality,
                              Scale scale,
                              ViewHelper viewHelper) {
        stage.setTitle(title);

        if (!modality.equals(Modality.NONE))
            stage.initModality(modality);

        setSize(stage, scale);
        setPosition(stage, scale);

        Scene scene = initScene(viewHelper);
        //initFrame(scene);
        stage.setScene(scene);
        stage.show();
    }

    private void setSize(Stage stage,
                         Scale scale) {
        stage.setWidth(scale.width);
        stage.setHeight(scale.height);
    }

    private void setPosition(Stage stage,
                             Scale scale) {
        var point = Screen.calculateCenter(scale.width, scale.height);

        stage.setX(point.x);
        stage.setY(point.y);
    }

    /**
     * Check if Scene is ready.
     *
     * @param viewAction
     * @return
     */
    private Scene initScene(ViewHelper viewAction) {
        Parent view = viewAction.view.getView();

        return view.isNeedsLayout() ?
                new Scene(view)
                :
                view.getScene();
    }

    /**
     * Override this method, to add any additional actions when you want to open new Scene.
     * Such as clear fields or something.
     *
     * @param scene
     */
    private void initFrame(Scene scene) {
        if (scene.getRoot().getChildrenUnmodifiable().get(0) instanceof GridPane) {
            GridPane gridPane = (GridPane) scene.getRoot().getChildrenUnmodifiable().get(0);
            if (gridPane.getChildren().size() > 0 &&
                    gridPane.getChildren().get(1) instanceof TextField) {
                TextField field = (TextField) gridPane.getChildren().get(1);
                field.setText("");
            }
        }
    }

    @Override
    public void start(Stage primaryStage) {
        throw new UnsupportedOperationException();
    }
}
