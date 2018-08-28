# Controller Relationship
> An example of how you can get other component every where. 
# Screenshot
![ControllerRelationship - Screenshot](https://github.com/MrChebik/ControllerRelationship/blob/master/controllerrelationship-screenshot.png?raw=true)
# Easy implementation - afterburner.fx
## ViewHelper
```java
@AllArgsConstructor
public enum ViewHelper {
    PLACE_START(new StartView()),
    PLACE_CHILD(new ChildView());

    public FXMLView view;
}
```
## Controller - Main
```java
public class StartPresenter implements Initializable {
    @FXML
    private Label label;

    @FXML
    private void clicked() {
        label.setText(((ChildPresenter) ViewHelper.PLACE_CHILD.view.getPresenter()).textfield.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new ChildPlace().start();
    }
}
```
## Controller - Child
```java
public class ChildPresenter {
    @FXML
    public TextField textfield;
}

```