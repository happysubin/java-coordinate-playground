package challenge.coordinatescalculator;

import java.util.List;

public interface Shape {
    List<Position> getPositions();
    double calculateArea();
    boolean hasPoint(int x, int y);
    String getDistanceInfo();

    void validatePositions();
}
