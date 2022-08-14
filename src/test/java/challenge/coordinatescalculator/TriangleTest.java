package challenge.coordinatescalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {

    @Test
    void createSuccess() {
        //given
        List<Position> positions = Arrays.asList(new Position(1,2), new Position(3, 4), new Position(5, 3));

        //when
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //then
        assertThat(shape.getPositions().size()).isEqualTo(3);
    }

    @Test
    void calculateTest(){
        //given
        List<Position> positions = Arrays.asList(new Position(10,10), new Position(14, 15), new Position(20, 8));
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //when, then
        String distanceInfo = shape.getDistanceInfo();

        //then
        assertThat(distanceInfo).isEqualTo("삼각형 넓이는 29.0");
    }
}
