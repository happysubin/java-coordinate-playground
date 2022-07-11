package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public String generateReport() {
        String result = "";
        for (Car car : cars) {
            result += car.getName() + " : " +
                    (int)car.getDistancePerLiter() + "리터\n";
        }
        return result;
    }
}
