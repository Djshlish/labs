package LAB_7;

import java.util.ArrayList;

public class Task1 {
    public void run() {
        ArrayList<Car> cars = new ArrayList<>();

        // Створення 10 машинок
        for (int i = 1; i <= 10; i++) {
            Driver d = new Driver("Водій " + i, 20 + i, i % 6 + 1);
            cars.add(new Car("Brand" + i, 100.0 + i * 10, d, 5000.0 + i * 500, 2010 + i));
        }

        // Ремонт мотору половині автопарку (+10% потужності)
        int halfSize = cars.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            Car currentCar = cars.get(i);
            currentCar.setEnginePower(currentCar.getEnginePower() * 1.10);
            currentCar.setDriver(new Driver("Новий Водій " + i, 30, 6));
        }

        // Кожна друга машина: підвищення потужності на 10% та ціни на 5%
        for (int i = 0; i < cars.size(); i += 2) {
            Car c = cars.get(i);
            c.setEnginePower(c.getEnginePower() * 1.10);
            c.setPrice(c.getPrice() * 1.05);
        }

        // Перевірка досвіду ВСІХ водіїв
        for (Car car : cars) {
            Driver d = car.getDriver();
            if (d.getExperience() < 5 && d.getAge() > 25) {
                d.addExperience(1);
            }
        }

        // Робота з масивом та хелпером
        Car[] carsArray = cars.toArray(new Car[0]);
        Car randomCar = Helper.getRandomCar(carsArray);
        
        Helper.dispatchCar(randomCar);
        Helper.arrive(randomCar);
    }
}
