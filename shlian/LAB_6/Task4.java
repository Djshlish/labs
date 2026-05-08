package LAB_6;

abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println(model + " газує!");
    }

    abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void brake() {
        System.out.println("Седан " + model + " плавно гальмує дисковими гальмами.");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void brake() {
        System.out.println("Вантажівка " + model + " використовує пневматичні гальма.");
    }
}

public class Task4 {
    public static void run() {
        Sedan myCar = new Sedan("Audi 80 B4", "Сірий металік", 190);
        Truck myTruck = new Truck("Renault Magnum", "Білий", 130);
        
        myCar.gas();
        myCar.brake();
        
        myTruck.gas();
        myTruck.brake();
    }
}
