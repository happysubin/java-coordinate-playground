package challenge.coordinatescalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class LineTest {

    @Test
    void createSuccess() {
        //given
        List<Position> positions = Arrays.asList(new Position(1,2), new Position(3, 4));

        //when
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //then
        assertThat(shape.getPositions().size()).isEqualTo(2);
    }

    @Test
    void calculateLine() {
        //given
        List<Position> positions = Arrays.asList(new Position(10,10), new Position(14, 15));
        Shape shape = ShapeGroup.getShape(positions.size(), positions);

        //when
        double result = shape.calculateArea();

        //then
        assertThat(result).isEqualTo(6.4031, offset(0.00099));
    }
}
