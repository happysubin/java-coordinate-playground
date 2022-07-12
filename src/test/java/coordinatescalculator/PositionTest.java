package coordinatescalculator;

import com.sun.tools.classfile.TypeAnnotation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void createPosition() {
        //given
        String num = "9";

        //when
        Position position = new Position(num);

        //then

        Assertions.assertThat(position.getPosition()).isEqualTo(9);

    }
}
