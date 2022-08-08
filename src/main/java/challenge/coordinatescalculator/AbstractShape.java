package challenge.coordinatescalculator;

import java.util.List;

public abstract class AbstractShape implements Shape{

    private List<Position> positions;

    public AbstractShape(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public List<Position> getPositions() {
        return positions;
    }
}
