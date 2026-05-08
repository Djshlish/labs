package LAB_3;

public class Task1 {
    private final String phrase = "Виконання лабораторної роботи з програмування";

    public void execute() {
        System.out.println("--- Завдання 1 (цикл for) ---");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + phrase);
        }

        System.out.println("--- Завдання 1 (цикл while) ---");
        int j = 0;
        while (j < 50) {
            System.out.println((j + 1) + ". " + phrase);
            j++;
        }
    }
}