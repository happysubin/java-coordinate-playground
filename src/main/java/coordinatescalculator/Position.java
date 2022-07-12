package coordinatescalculator;

public class Position {

    private int position;

    public Position(String num) {
        this.position = makePosition(num);
    }

    public int makePosition(String num){
        int number = Integer.parseInt(num);
        if(number > 24 | number < 0){
            throw new IllegalArgumentException("숫자는 24이하, 0 이상입니다.");
        }
        return number;
    }

    public int getPosition() {
        return position;
    }
}
