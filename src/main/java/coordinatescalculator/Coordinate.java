package coordinatescalculator;

import java.util.Arrays;
import java.util.List;

public class Coordinate {

    private Position x;
    private Position y;

    public Coordinate(String coordinate) {
        this.x = createXPosition(coordinate);
        this.y = createYPosition(coordinate);
    }

    public Position createXPosition(String coordinate){
        String xPosition = selectXPosition(coordinate);
        return new Position(xPosition);
    }

    public Position createYPosition(String coordinate){
        String yPosition = selectYPosition(coordinate);
        return new Position(yPosition);
    }

    public String selectXPosition(String coordinate){
        List<String> position = dividePosition(coordinate);
        return position.get(0);
    }

    public String selectYPosition(String coordinate){
        List<String> position = dividePosition(coordinate);
        return position.get(1);
    }

    public List<String> dividePosition(String coordinate){
        coordinate = coordinate.replace(")","");
        coordinate = coordinate.replace("(","");
        String[] array = coordinate.split(",");
        return Arrays.asList(array);
    }


    public Position getX() {
        return x;
    }

    public Position getY() {
        return y;
    }
}
