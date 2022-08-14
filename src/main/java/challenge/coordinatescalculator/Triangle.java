package challenge.coordinatescalculator;

import java.util.List;

public class Triangle extends AbstractShape {

    public final static String UNSUPPORTED_METHOD_TRIANGLE = "TRIANGLE 클래스에서는 지원하지 않는 메서드입니다.";

    public Triangle(List<Position> positions) {
        super(positions);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String getDistanceInfo() {
        return null;
    }

    @Override
    public void validatePositions() {
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD_TRIANGLE);

    }
}
