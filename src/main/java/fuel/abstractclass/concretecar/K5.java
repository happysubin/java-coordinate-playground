package fuel.concretecar;

import fuel.Car;

public class K5 extends Car {

    public K5(int tripDistance) {
        super(tripDistance, "K5");
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    public double getDistancePerLiter(){
        return tripDistance / 13;
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
