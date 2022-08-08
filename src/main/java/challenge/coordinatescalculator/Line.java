package challenge.coordinatescalculator;

import java.util.List;

public class Line extends AbstractShape{

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
}
