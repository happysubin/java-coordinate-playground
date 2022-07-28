package challenge.fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String COLON_WITH_SPACE = " : ";
    private static final String LITER = "리터";
    private List<Car> cars = new ArrayList<>();
    public static RentCompany rentCompany;

    public static RentCompany create() {
        if(rentCompany == null){
            return new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Car car : cars) {
            stringBuilder.append(car.getName())
                    .append(COLON_WITH_SPACE)
                    .append((int) car.getChargeQuantity())
                    .append(LITER)
                    .append(NEWLINE);
        }

        return stringBuilder.toString();
    }
}
