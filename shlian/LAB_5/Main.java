package LAB_5;

public class Main {
    public static void main(String[] args) {
        HelperUtils utils = new HelperUtils();

        System.out.println("--- Завдання 1: Площа ромба ---");
        Rhombus rhombus = new Rhombus(12.0, 9.5);
        System.out.println("Площа: " + rhombus.calculateArea());

        System.out.println("\n--- Завдання 2: Пошук мінімуму ---");
        utils.getMin(45, 12, 28);

        System.out.println("\n--- Завдання 3 та 4: Робота з масивом ---");
        int[] data = {5, 22, 8, 31, 4, 17};
        utils.displayArray(data);
        System.out.println("Максимальне число: " + utils.getMax(data));
    }
}