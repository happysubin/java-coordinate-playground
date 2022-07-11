package fuel.interfaceex.implementation;

import fuel.interfaceex.Car;

public class Sonata implements Car {

    private String name;
    protected int tripDistance;

    public Sonata(int tripDistance) {
        this.name = "Sonata";
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return tripDistance / 10;
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
