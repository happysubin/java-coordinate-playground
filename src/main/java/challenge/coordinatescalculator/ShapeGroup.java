package challenge.coordinatescalculator;

import java.util.Arrays;
import java.util.List;

public enum ShapeGroup {
    LINE(2){
        @Override
        public Shape createShape(List<Position> positions) {
            return new Line(positions);
        }
    },
    TRIANGLE(3){
        @Override
        public Shape createShape(List<Position> positions) {
            return new Triangle(positions);
        }
    },
    RECTANGLE(4){
        @Override
        public Shape createShape(List<Position> positions) {
            return new Rectangle(positions);
        }
    };

    private final int positionNumber;
    public abstract Shape createShape(List<Position> positions);

    public static Shape getShape(int number, List<Position> positions){
        return Arrays.stream(values())
                .filter(shapeType -> shapeType.positionNumber == number)
                .map(shapeType -> shapeType.createShape(positions))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("좌표의 개수가 올바르지 않습니다."));
    }

    ShapeGroup(int positionNumber) {
        this.positionNumber = positionNumber;
    }
}
