package challenge.coordinatescalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RectangleTest {

    @Test
    void successValidateTest(){
        //given
        List<Position> positions = Arrays.asList(new Position(2,2), new Position(2, 4), new Position(4, 4), new Position(4, 2));
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //when, then
        shape.validatePositions();
    }

    @Test
    void failValidateTest() {
        //given
        List<Position> positions = Arrays.asList(new Position(2, 2), new Position(3, 4), new Position(4, 4), new Position(4, 2));

        assertThatThrownBy(() -> {
            Shape shape = ShapeGroup.getShape(positions.size(), positions);
        }).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void calculateTest(){
        //given
        List<Position> positions = Arrays.asList(new Position(2,2), new Position(2, 4), new Position(4, 4), new Position(4, 2));
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //when, then
        double result = shape.calculateArea();

        //then
        assertThat(result).isEqualTo(4.0);
    }

    @Test
    void printTest(){
        //given
        List<Position> positions = Arrays.asList(new Position(2,2), new Position(2, 4), new Position(4, 4), new Position(4, 2));
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //when, then
        String distanceInfo = shape.getDistanceInfo();

        //then
        assertThat(distanceInfo).isEqualTo("사각형 넓이는 " + 4.0);
    }
}
