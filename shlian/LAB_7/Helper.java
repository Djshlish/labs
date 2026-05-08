package LAB_7;

import java.util.Random;

public class Helper {
    public static Car getRandomCar(Car[] carsArray) {
        int index = new Random().nextInt(carsArray.length);
        return carsArray[index];
    }

    public static void dispatchCar(Car car) {
        System.out.println("Автомобіль марки " + car.getBrand() + " з водієм " + car.getDriver().getName() + " виїхав за вами");
    }

    public static void arrive(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
    }
}
