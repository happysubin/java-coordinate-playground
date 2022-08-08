package challenge.coordinatescalculator;

import java.util.List;

public class Line implements Shape{

    private List<Position> positions;

    public Line(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public List<Position> getPositions() {
        return positions;
    }
}
