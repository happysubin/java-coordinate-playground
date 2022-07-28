package challenge.fuel;

public class Avante extends Car{

    private final String name = "Avante";
    private final int distancePerLiter = 15;

    public Avante(int tripDistance) {
        super(tripDistance);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDistancePerLiter() {
        return distancePerLiter;
    }
}
