package challenge.fuel;

public class Sonata extends Car {

    private final String name = "Sonata";
    private final int distancePerLiter = 10;

    public Sonata(int tripDistance) {
        super(tripDistance);
    }

    @Override
    public double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public String getName() {
        return name;
    }
}
