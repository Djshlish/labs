package LAB_3;

public class Task5 {
    private double minRange;
    private double maxRange;

    // Інкапсуляція меж через конструктор
    public Task5(double minRange, double maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    // Приватний метод для обчислення самої функції
    private double calculateFunction(double x) {
        return (x + 2 * Math.pow(x, 3) + 1.9) / (Math.sqrt(x) - 1.5);
    }

    public void executeFor() {
        System.out.println("\n--- Завдання 5 (Варіант 11 - цикл FOR) ---");
        int count = 0;
        for (double x = 2.0; x <= 4.0001; x += 0.1) {
            double y = calculateFunction(x);
            System.out.printf("x = %.1f\t|\t f(x) = %.4f\n", x, y);
            if (y >= minRange && y <= maxRange) {
                count++;
            }
        }
        printCountResult(count);
    }

    public void executeWhile() {
        System.out.println("\n--- Завдання 5 (Варіант 11 - цикл WHILE) ---");
        int count = 0;
        double x = 2.0;
        while (x <= 4.0001) {
            double y = calculateFunction(x);
            System.out.printf("x = %.1f\t|\t f(x) = %.4f\n", x, y);
            if (y >= minRange && y <= maxRange) {
                count++;
            }
            x += 0.1;
        }
        printCountResult(count);
    }

    private void printCountResult(int count) {
        if (count > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + count);
        } else {
            System.out.println("Значення функції у заданому діапазоні відсутні.");
        }
    }
}
