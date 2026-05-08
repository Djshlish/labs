package LAB_2;

public class Task1 {
    public void execute(double a, double b, double c) {
        System.out.println("\n--- Завдання 1: Квадратне рівняння ---");
        if (a == 0) {
            System.out.println("Це не квадратне рівняння (a = 0).");
            return;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Дискримінант D = " + discriminant);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Рівняння має два корені: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Рівняння має один корінь: x = %.2f\n", x);
        } else {
            System.out.println("Рівняння не має дійсних коренів (D < 0).");
        }
    }
}
