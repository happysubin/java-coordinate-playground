package challenge.coordinatescalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {

    @Test
    void createSuccess() {
        //given
        List<Position> positions = Arrays.asList(new Position(1,2), new Position(3, 4), new Position(5, 3), new Position(9, 4));

        //when
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //then
        assertThat(shape.getPositions().size()).isEqualTo(4);
    }
}
