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

    public double calculateDistance (Position position){
        return position.calculate(x, y);
    }

    private Double calculate(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y -y, 2));
    }


}
