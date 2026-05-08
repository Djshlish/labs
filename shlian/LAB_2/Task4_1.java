package LAB_2;

public class Task4_1 {
    public void execute(double x) {
        System.out.println("\n--- Завдання 4.1 ---");
        double result;
        if (x < 0) {
            result = Math.abs(x + 7);
        } else if (x >= 0 && x <= 5) {
            result = (Math.exp(2 * x) + Math.exp(-x)) / 2.0;
        } else {
            result = Math.pow(x, 2) - 2 * x + 1;
        }
        System.out.printf("Результат f(x) = %.5f\n", result);
    }
}
