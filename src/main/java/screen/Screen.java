package screen;

import screen.measurement.Point;
import javafx.geometry.Rectangle2D;

public class Screen {
    private static final Rectangle2D bounds = javafx.stage.Screen.getPrimary().getVisualBounds();

    public static Point calculateCenter(double width, double height) {
        var x = (bounds.getWidth() - width) / 2;
        var y = (bounds.getHeight() - height) / 2;

        return new Point(x, y);
    }
}
