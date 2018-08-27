# Controller Relationship
> An example of how you can get other component every where. 
# Screenshot
![ControllerRelationship - Screenshot](https://github.com/MrChebik/ControllerRelationship/blob/master/controllerrelationship-screenshot.png?raw=true)
# Easy implementation
## Controller - 1 - Main
```java
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
```
## Controller - 2 - Child
```java
public class ChildPresenter implements Initializable {
    @FXML
    public TextField textfield;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Collector.child = this;
    }
}
```
## Collector
```java
public class Collector {
    public static ChildPresenter child;
}
```