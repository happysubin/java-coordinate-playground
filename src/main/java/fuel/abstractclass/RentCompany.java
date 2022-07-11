package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    List<fuel.Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(fuel.Car car){
        cars.add(car);
    }

    public String generateReport() {
        String result = "";
        for (fuel.Car car : cars) {
            result += car.getName() + " : " +
                    (int)car.getDistancePerLiter() + "리터\n";
        }
        return result;
    }

    public List<fuel.Car> getCars() {
        return cars;
    }
}
