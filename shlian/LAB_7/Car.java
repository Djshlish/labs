package LAB_7;

public class Car {
    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public double getEnginePower() { return enginePower; }
    public void setEnginePower(double enginePower) { this.enginePower = enginePower; }
    
    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
