package challenge.coordinatescalculator;

import java.util.List;

public class Rectangle implements Shape {

    private List<Position> positions;

    public Rectangle(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public List<Position> getPositions() {
        return positions;
    }
}
