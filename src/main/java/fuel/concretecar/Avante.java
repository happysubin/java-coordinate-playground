package fuel.concretecar;

import fuel.Car;

public class Avante extends Car {

    public Avante(int tripDistance) {
        super(tripDistance, "Avante");
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    public double getDistancePerLiter(){
        return tripDistance / 15;
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
