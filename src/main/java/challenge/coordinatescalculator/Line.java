package challenge.coordinatescalculator;

import java.util.List;

public class Line extends AbstractShape{

    public final static String PRINT_LINE_DISTANCE_TEXT = "두 점 사이의 거리는 ";
    public final static String UNSUPPORTED_METHOD_LINE = "LINE 클래스에서는 지원하지 않는 메서드입니다.";

    public Line(List<Position> positions) {
        super(positions);
    }

    @Override
    public double calculateArea() {
        List<Position> positions = getPositions();
        double result = positions.get(0).calculateDistance(positions.get(1));
        return result;
    }
    // 선이 Area를 가지는 것이 말이 안된다. 인터페이스 타입을 사용하는데 어떻게 해야 이를 해결할 수 있을 까?


    @Override
    public String getDistanceInfo() {
        return PRINT_LINE_DISTANCE_TEXT + calculateArea();
    }

    @Override
    public void validatePositions() {
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD_LINE);
    }
}
