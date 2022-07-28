package challenge.fuel;

public class K5 extends Car{

    private final String name = "K5";
    private final int distancePerLiter = 13;

    public K5(int tripDistance) {
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
