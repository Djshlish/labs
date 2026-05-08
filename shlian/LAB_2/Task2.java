package LAB_2;

public class Task2 {
    public void execute(double x, double y) {
        System.out.println("\n--- Завдання 2: Визначення квадранта ---");
        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться у I квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться у II квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться у III квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться у IV квадранті.");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка лежить на осі Y.");
        } else if (y == 0 && x != 0) {
            System.out.println("Точка лежить на осі X.");
        } else {
            System.out.println("Точка знаходиться в початку координат.");
        }
    }
}
