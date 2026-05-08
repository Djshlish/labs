package LAB_1;

public class Car {
    private int horsePower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isAutomatic;

    public Car(int horsePower, double engineVolume, String brand, String model, int year, String color, boolean isAutomatic) {
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    public int getHorsePower() { return horsePower; }
    public double getEngineVolume() { return engineVolume; }
}
