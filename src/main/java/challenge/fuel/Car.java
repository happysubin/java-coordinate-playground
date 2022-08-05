package challenge.fuel;

public abstract class Car implements CarModule {

    private final int tripDistance;
    private final double distancePerLiter;

    public Car(int tripDistance, double distancePerLiter) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = distancePerLiter;
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance / distancePerLiter;
    }
}

//많이 겹치는 부분은 추상 메서드를 용해 중복을 줄인다.