package coordinatescalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CoordinatesTest {

    @Test
    @DisplayName("일급 컬렉션 분리")
    void create() {
        String position = "(6,3)-(3,7)";
        Coordinates coordinates = new Coordinates(position);

        List<Coordinate> list = coordinates.getCoordinates();
        Assertions.assertThat(list.get(0).getX().getPosition()).isEqualTo(6);
        Assertions.assertThat(list.get(0).getY().getPosition()).isEqualTo(3);

        Assertions.assertThat(list.get(1).getX().getPosition()).isEqualTo(3);
        Assertions.assertThat(list.get(1).getY().getPosition()).isEqualTo(7);
    }


}
