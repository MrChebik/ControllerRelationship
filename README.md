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
        label.setText(Collector.target.getText());
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
    private TextField textfield;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Collector.target = textfield;
    }
}
```
## Collector
```java
public class Collector {
    public static TextField target;
}
```