package LAB_6;

class VIPGuestRecord extends GuestRecord {
    int roomNumber;
    boolean hasBreakfast;

    public void inputVIPData(String name, String address, double pricePerDay, int days, int roomNumber, boolean hasBreakfast) {
        super.inputData(name, address, pricePerDay, days);
        this.roomNumber = roomNumber;
        this.hasBreakfast = hasBreakfast;
    }

    @Override
    public void printData() {
        super.printData(); // Викликаємо вивід базового класу
        System.out.println("Номер кімнати: " + roomNumber + " (VIP)");
        System.out.println("Включений сніданок: " + (hasBreakfast ? "Так" : "Ні"));
    }
}

public class Task6 {
    public static void run() {
        VIPGuestRecord vipGuest = new VIPGuestRecord();
        vipGuest.inputVIPData("Леся Українка", "Київ, вул. Хрещатик", 1500.0, 5, 777, true);
        vipGuest.printData();
        System.out.println("Загальна вартість (VIP): " + vipGuest.calculateTotalCost() + " грн");
    }
}
