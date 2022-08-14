package challenge.coordinatescalculator;

import java.util.List;

public class Triangle extends AbstractShape {

    public final static String PRINT_LINE_DISTANCE_TEXT = "삼각형 넓이는 ";

    public final static String UNSUPPORTED_METHOD_TRIANGLE = "TRIANGLE 클래스에서는 지원하지 않는 메서드입니다.";

    public Triangle(List<Position> positions) {
        super(positions);
    }

    @Override
    public double calculateArea() {
        List<Position> positions = getPositions();
        double firstXDistance = Math.pow(positions.get(0).getX() - positions.get(1).getX(), 2);
        double firstYDistance = Math.pow(positions.get(0).getY() - positions.get(1).getY(), 2);
        double secondXDistance = Math.pow(positions.get(1).getX() - positions.get(2).getX(), 2);
        double secondYDistance = Math.pow(positions.get(1).getY() - positions.get(2).getY(), 2);
        double thirdXDistance = Math.pow(positions.get(2).getX() - positions.get(0).getX(), 2);
        double thirdYDistance = Math.pow(positions.get(2).getY() - positions.get(0).getY(), 2);
        double firstResult = Math.sqrt(firstXDistance + firstYDistance);
        double secondResult = Math.sqrt(secondXDistance + secondYDistance);
        double thirdResult = Math.sqrt(thirdXDistance + thirdYDistance);

        double s = (firstResult + secondResult + thirdResult) / 2;
        double area = Math.sqrt( s * (s - firstResult) * (s - secondResult) * ( s - thirdResult));
        return Math.round(area); //반 올림
    }

    @Override
    public String getDistanceInfo() {
        return PRINT_LINE_DISTANCE_TEXT + calculateArea();
    }

    @Override
    public void validatePositions() {
        throw new UnsupportedOperationException(UNSUPPORTED_METHOD_TRIANGLE);

    }
}
