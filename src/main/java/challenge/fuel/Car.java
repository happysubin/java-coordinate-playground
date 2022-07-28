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
