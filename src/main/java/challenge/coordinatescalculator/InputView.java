package challenge.coordinatescalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private static String INVALID_POSITION_FORMAT = "좌표의 형식과 다릅니다";
    private static String INVALID_POSITION_RANGE = "좌표의 범위는 0부터 24까지입니다.";


    private Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public List<Position> getShape(){
        String stringFormatPosition = inputPosition();
        List<PositionDto> dtoList = splitPosition(stringFormatPosition);
        validatePositionRange(dtoList);
        return createShape(dtoList);
    }

    private List<Position> createShape(List<PositionDto> dtoList) {
        List<Position> result = new ArrayList<>();
        for (PositionDto dto : dtoList) {
            result.add(new Position(dto.getX(), dto.getY()));
        }
        return result;
    }

    public String inputPosition() {
        return scanner.next();
    }

    public void validatePositionFormat(String stringFormatPosition) {
        Pattern pattern = Pattern.compile("\\([0-9]{1,2},[0-9]{1,2}\\)(-(\\([0-9]{1,2},[0-9]{1,2}\\))){1,3}");
        Matcher matcher = pattern.matcher(stringFormatPosition);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(INVALID_POSITION_FORMAT);
        }
    }

    public void validatePositionRange(List<PositionDto> dtoList) {
        for (PositionDto positionDto : dtoList) {
            int x = positionDto.getX();
            int y = positionDto.getY();
            if(x > 24 | x < 0 | y > 24 | y < 0 ){
                throw new IllegalArgumentException(INVALID_POSITION_RANGE);
            }
        }
    }

    public List<PositionDto> splitPosition(String stringFormatPosition) {
        List<PositionDto> list = new ArrayList<>();
        stringFormatPosition = stringFormatPosition.replaceAll("[\\(\\)]",""); //괄호를 벗김
        String[] positions = stringFormatPosition.split("-"); // -를 기준으로 나눈다.
        for (String position : positions) {
            String[] split = position.split(",");
            list.add(new PositionDto(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }
        return list;
    }
}
