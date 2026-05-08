package LAB_3;

public class Task4 {
    public void execute() {
        System.out.println("\n--- Завдання 4 (цикл for) ---");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.println(h + " h " + m + " min " + s + " sec");
                }
            }
        }
    }
}
