package LAB_6;

class GuestRecord {
    String name;
    String address;
    double pricePerDay;
    int days;

    public void inputData(String name, String address, double pricePerDay, int days) {
        this.name = name;
        this.address = address;
        this.pricePerDay = pricePerDay;
        this.days = days;
    }

    public void printData() {
        System.out.println("--- Дані гостя ---");
        System.out.println("Ім'я: " + name);
        System.out.println("Адреса: " + address);
        System.out.println("Ціна за добу: " + pricePerDay + " грн");
        System.out.println("Термін проживання: " + days + " діб");
    }

    public double calculateTotalCost() {
        return pricePerDay * days;
    }
}

public class Task5_11 {
    public static void run() {
        GuestRecord guest = new GuestRecord();
        guest.inputData("Іван Франко", "Львів, вул. Університетська 1", 800.0, 3);
        guest.printData();
        System.out.println("До сплати: " + guest.calculateTotalCost() + " грн");
    }
}
