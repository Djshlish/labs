package LAB_6;

class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
        this.number = "Немає";
        this.model = "Невідома";
        this.weight = 0.0;
    }

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Дзвонить " + name + " з номера " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.print("Відправка повідомлення на номери: ");
        for (String num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}

public class Task2 {
    public static void run() {
        Phone ph1 = new Phone("+380991234567", "Google Pixel", 168.5);
        Phone ph2 = new Phone("+380671234567", "Samsung");
        Phone ph3 = new Phone();
        
        System.out.println("Телефон 1: " + ph1.getNumber());
        System.out.println("Телефон 2: " + ph2.getNumber());
        System.out.println("Телефон 3: " + ph3.getNumber());
        
        ph2.receiveCall("Олександр");
        ph1.receiveCall("Марія", "+380509876543");
        
        ph3.sendMessage("+380630000001", "+380630000002", "+380630000003");
    }
}
