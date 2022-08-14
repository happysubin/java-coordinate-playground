package challenge.coordinatescalculator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Rectangle extends AbstractShape {

    private Set<Double> xSet = new HashSet<>();
    private Set<Double> ySet = new HashSet<>();

    public final static String PRINT_LINE_DISTANCE_TEXT = "사각형 넓이는 ";
    public static final String INVALID_RECTANGLE = "직사각형 모양이 아닙니다.";

    public Rectangle(List<Position> positions) {
        super(positions);
        validatePositions();
    }

    @Override
    public double calculateArea() {
        Double xDistance = xSet.stream().reduce(0D, (x, y) -> Math.abs(x - y));
        Double yDistance = ySet.stream().reduce(0D, (x, y) -> Math.abs(x - y));

        return xDistance * yDistance;
    }

    @Override
    public String getDistanceInfo() {
        return PRINT_LINE_DISTANCE_TEXT + calculateArea();
    }

    @Override
    public void validatePositions() {
        List<Position> positions = getPositions();

        for (Position position : positions) {
            xSet.add(position.getX());
            ySet.add(position.getY());
        }

        if(xSet.size() != 2 || ySet.size() != 2){
            throw new IllegalStateException(INVALID_RECTANGLE);
        }
    }
}
