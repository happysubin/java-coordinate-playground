package challenge.coordinatescalculator;

import java.util.List;

public class Line extends AbstractShape{

    public final static String PRINT_LINE_DISTANCE_TEXT = "두 점 사이의 거리는 ";

    public Line(List<Position> positions) {
        super(positions);
    }

    @Override
    public double calculateArea() {
        List<Position> positions = getPositions();
        double xDistance = Math.pow(positions.get(0).getX() - positions.get(1).getX(), 2);
        double yDistance = Math.pow(positions.get(0).getY() - positions.get(1).getY(), 2);
        double result = Math.sqrt(xDistance + yDistance);
        return result;
    }
    // 선이 Area를 가지는 것이 말이 안된다. 인터페이스 타입을 사용하는데 어떻게 해야 이를 해결할 수 있을 까?


    @Override
    public void printDistance() {
        System.out.println(PRINT_LINE_DISTANCE_TEXT + calculateArea());
    }
}
