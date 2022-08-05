package challenge.coordinatescalculator;

import org.junit.jupiter.api.Test;

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
        String shape = inputView.getShape();

        //then
        assertThat(shape).isEqualTo(positionExample);
    }

    @Test
    void successValidatePositionFormat(){
        //given
        InputView inputView = new InputView();

        //when
        inputView.validatePositionFormat(positionExample);

    }

    @Test
    void failValidatePositionFormat(){
        //given
        InputView inputView = new InputView();

        //when
        assertThatThrownBy(() -> {
            inputView.validatePositionFormat(badPositionExample);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
