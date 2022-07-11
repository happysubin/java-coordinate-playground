package fuel;

public abstract class Car {

    protected int tripDistance;
    protected String name;

    public Car(int tripDistance, String name) {
        this.tripDistance = tripDistance;
        this.name = name;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    protected abstract double getDistancePerLiter();

    protected abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    protected abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
