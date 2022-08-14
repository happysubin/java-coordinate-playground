package challenge.coordinatescalculator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rectangle extends AbstractShape {

    public Rectangle(List<Position> positions) {
        super(positions);
        validatePositions();
    }



    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String getDistanceInfo() {
        return null;
    }

    @Override
    public void validatePositions() {
        List<Position> positions = getPositions();
        Set<Double> xSet = new HashSet<>();
        Set<Double> ySet = new HashSet<>();

        for (Position position : positions) {
            xSet.add(position.getX());
            ySet.add(position.getY());
        }

        if(xSet.size() != 2 || ySet.size() != 2){
            throw new IllegalStateException("직사각형 모양이 아닙니다");
        }
    }
}
