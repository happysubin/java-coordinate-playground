package coordinatescalculator.shape;

import coordinatescalculator.Coordinates;

public class Line implements Shape{

    Coordinates coordinates;

    public Line(String coordinates) {
        this.coordinates = new Coordinates(coordinates);
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("라인은 넓이를 계산할 수 없습니다");
    }

    public double getDistance(){
        return 1;
    }
}
