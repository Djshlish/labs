package LAB_3;

public class Task3 {
    public void execute() {
        System.out.println("\n--- Завдання 3 (цикл while) ---");
        int h = 0;
        while (h <= 2) {
            int m = 0;
            while (m < 60) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            h++;
        }
    }
}
