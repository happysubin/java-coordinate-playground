package challenge.coordinatescalculator;

import java.util.List;

public class Triangle implements Shape {

    private List<Position> positions;

    public Triangle(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public List<Position> getPositions() {
        return positions;
    }
}
