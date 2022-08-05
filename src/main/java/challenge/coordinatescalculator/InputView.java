package challenge.coordinatescalculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private static String INVALID_POSITION_FORMAT = "좌표의 형식과 다릅니다";

    private Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String getShape(){
        String stringFormatPosition = inputPosition();
        validatePositionFormat(stringFormatPosition);
        return stringFormatPosition;
    }

    public void validatePositionFormat(String stringFormatPosition) {
        Pattern pattern = Pattern.compile("\\([0-9]{1,2},[0-9]{1,2}\\)(-(\\([0-9]{1,2},[0-9]{1,2}\\))){1,3}");
        Matcher matcher = pattern.matcher(stringFormatPosition);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(INVALID_POSITION_FORMAT);
        }
    }

    public String inputPosition() {
        return scanner.next();
    }
}
