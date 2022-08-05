package challenge.coordinatescalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    public static String positionExample = "(3,10)-(4,10)";
    public static String badPositionExample = "(3,10)-(4,10)!";

    @Test
    void inputViewTest(){
        //given
        InputView inputView = new InputView() {
            @Override
            public String inputPosition() {
                return positionExample;
            }
        };
        //when
        List<Position> result = inputView.getShape();

        //then
        assertThat(result.get(0).getX()).isEqualTo(3);
        assertThat(result.get(0).getY()).isEqualTo(10);
        assertThat(result.get(1).getX()).isEqualTo(4);
        assertThat(result.get(1).getY()).isEqualTo(10);
    }

    @Test
    void successValidatePositionFormat(){
        //given
        InputView inputView = new InputView();

        //when
        inputView.validatePositionFormat(positionExample);

        //then
    }

    @Test
    void failValidatePositionFormat(){
        //given
        InputView inputView = new InputView();

        //when
        assertThatThrownBy(() -> {
            inputView.validatePositionFormat(badPositionExample);
            //then
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void successSplitPosition(){
        //given
        InputView inputView = new InputView();

        //when
        List<PositionDto> result = inputView.splitPosition(positionExample);

        //then
        assertThat(result.get(0).getX()).isEqualTo(3);
        assertThat(result.get(0).getY()).isEqualTo(10);
        assertThat(result.get(1).getX()).isEqualTo(4);
        assertThat(result.get(1).getY()).isEqualTo(10);
    }

    @Test
    void successValidatePositionRange(){
        //given
        InputView inputView = new InputView();
        List<PositionDto> dtoList = Arrays.asList(new PositionDto(3,4));

        //when
        inputView.validatePositionRange(dtoList);

        //then
    }

    @Test
    void failValidatePositionRange(){
        //given
        InputView inputView = new InputView();
        List<PositionDto> dtoList = Arrays.asList(new PositionDto(34,4));

        //when
        assertThatThrownBy(() -> {
            inputView.validatePositionRange(dtoList);
            //then
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
