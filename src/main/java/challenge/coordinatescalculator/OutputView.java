

package challenge.coordinatescalculator;

import java.util.Arrays;
import java.util.List;

public class OutputView {

    //제일 낮은수는 1, 제일 높은 수는 24

    public static void main(String[] args) {
        Shape shape = ShapeGroup.getShape(2, Arrays.asList(new Position(2, 2), new Position(24, 24)));
        createOutView(shape);
    }

    public static void createOutView(Shape shape){
        List<Position> positions = shape.getPositions();

        for (int i = 24; i >= 1 ; i--) {
            if(i % 2 == 0 & i >= 10) System.out.print("  " + i + "|");
            else if(i % 2 == 0 &  i > 0 & i < 10) System.out.print("   " + i + "|");
            else System.out.print("    |");
            for (Position position : positions) {
                if(position.getY() == i ) {
                    String space = "";
                    for (int j = 0; j < position.getY(); j++) {
                        space += "  ";
                    }
                    System.out.print(space + ".");
                }
            }
            System.out.println();
        }

        System.out.print("    +");

        for (int i = 24; i >= 0 ; i--) {
            if(i % 2 ==0 & i < 20) System.out.print("----");
            else if(i % 2 ==0 ) System.out.print("-----");

        }

        System.out.println();
        System.out.print("   ");
        for (int i = 0; i <= 24 ; i++) {
            if( i == 0) System.out.print(i + "     ");
            else if(i % 2 == 0 )System.out.print(i + "   ");
        }
    }
}
