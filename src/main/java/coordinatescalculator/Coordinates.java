package coordinatescalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinates {

    List<Coordinate> coordinates;

    public Coordinates(String coordinatesString) {
        this.coordinates = makeCoordinates(coordinatesString);
    }

    public List<Coordinate> makeCoordinates(String coordinatesString){
        List<String> coordinates = Arrays.asList(coordinatesString.split("-"));
        List<Coordinate> result = new ArrayList<>();

        for (String coordinate : coordinates) {
            result.add(new Coordinate(coordinate));
        }

        return result;
    }


    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}
