package fuel.interfaceex.implementation;

import fuel.interfaceex.Car;

public class K5 implements Car {

    private String name;
    protected int tripDistance;

    public K5(int tripDistance) {
        this.name = "K5";
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return tripDistance / 13;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return name;
    }
}
