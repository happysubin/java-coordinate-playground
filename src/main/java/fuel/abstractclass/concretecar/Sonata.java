package fuel.concretecar;

import fuel.Car;

public class Sonata extends Car {

    public Sonata(int tripDistance) {
        super(tripDistance, "Sonata");
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    public double getDistancePerLiter(){
        return tripDistance / 10;
    }

    /**
     * 여행하려는 거리
     */
    @Override
    public double getTripDistance(){
        return super.tripDistance;
    }

    /**
     * 차종의 이름
     */
    @Override
    public String getName(){
        return super.name;
    }
}
