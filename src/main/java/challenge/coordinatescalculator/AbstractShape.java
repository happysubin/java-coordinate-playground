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

    @Override
    public boolean hasPoint(int x, int y) {
        for (Position position : positions) {
            if(position.isRightPosition(x, y)){
                return true;
            }
        }
        return false;
    }
}
