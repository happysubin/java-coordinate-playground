package challenge.coordinatescalculator;

import java.util.Objects;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public boolean isRightPosition(double x, double y){
        return this.x == x & this.y == y;
    }
}
