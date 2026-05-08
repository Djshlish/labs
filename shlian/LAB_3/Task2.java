package LAB_3;

public class Task2 {
    public void execute() {
        System.out.println("\n--- Завдання 2 (цикл for) ---");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }
    }
}
