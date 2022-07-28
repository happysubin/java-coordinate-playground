package challenge.fuel;

public abstract class Car implements CarModule {

    private final int tripDistance;

    public Car(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
