package challenge.coordinatescalculator;

import java.util.List;

public class Triangle extends AbstractShape {

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
}
