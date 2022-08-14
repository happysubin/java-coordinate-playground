package challenge.coordinatescalculator;

import java.awt.*;
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
        Position firstPosition = positions.get(0);
        Position secondPosition = positions.get(1);
        Position thirdPosition = positions.get(2);

        double firstDistance = firstPosition.calculateDistance(secondPosition);
        double secondDistance = secondPosition.calculateDistance(thirdPosition);
        double thirdDistance = thirdPosition.calculateDistance(firstPosition);

        double area = heronFormula(firstDistance, secondDistance, thirdDistance);
        return area; //반 올림
    }

    public double heronFormula(double a, double b, double c){
        double s = (a + b + c) / 2;
        double area = Math.sqrt( s * (s - a) * (s - b) * ( s - c));
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
