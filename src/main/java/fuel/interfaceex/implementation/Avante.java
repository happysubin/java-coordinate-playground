package fuel.interfaceex.implementation;

import fuel.interfaceex.Car;

public class Avante implements Car {
    private String name;
    protected int tripDistance;

    public Avante(int tripDistance) {
        this.name = "Avante";
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return tripDistance / 15;
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
