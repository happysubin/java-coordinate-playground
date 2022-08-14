package challenge.coordinatescalculator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        List<Position> positions= inputView.getShape();
        Shape shape = ShapeGroup.getShape(positions.size(), positions);
        OutputView.createOutView(shape);
        shape.printDistance();
    }
}
