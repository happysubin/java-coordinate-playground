package coordinatescalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CoordinateTest {

    @Test
    @DisplayName("좌표 문자열을 분리")
    void create() {
        String position = "(6,3)";
        Coordinate coordinate = new Coordinate(position);
        List<String> strings = coordinate.dividePosition(position);

        Assertions.assertThat(strings.get(0)).isEqualTo("6");
        Assertions.assertThat(strings.get(1)).isEqualTo("3");
    }

    @Test
    @DisplayName("X좌표 Y좌표 분리")
    void divideXAndY() {
        String position = "(6,3)";
        Coordinate coordinate = new Coordinate(position);
        String x = coordinate.selectXPosition(position);
        String y = coordinate.selectYPosition(position);

        Assertions.assertThat(y).isEqualTo("3");
        Assertions.assertThat(x).isEqualTo("6");
    }

    @Test
    @DisplayName("X좌표 Y좌표 생성")
    void createXAndY() {
        String position = "(6,3)";
        Coordinate coordinate = new Coordinate(position);
        Position xPosition = coordinate.createXPosition(position);
        Position yPosition = coordinate.createYPosition(position);

        Assertions.assertThat(xPosition.getPosition()).isEqualTo(6);
        Assertions.assertThat(yPosition.getPosition()).isEqualTo(3);
    }

    @Test
    @DisplayName("최종 좌표 생성")
    void createCoordinate() {
        String position = "(6,3)";
        Coordinate coordinate = new Coordinate(position);

        Assertions.assertThat(coordinate.getX().getPosition()).isEqualTo(6);
        Assertions.assertThat(coordinate.getY().getPosition()).isEqualTo(3);
    }
}
