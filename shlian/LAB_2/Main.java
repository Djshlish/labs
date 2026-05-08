package LAB_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Виклик Завдання 1
        Task1 t1 = new Task1();
        System.out.println("--- Введення даних для Завдання 1 ---");
        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть c: ");
        double c = scanner.nextDouble();
        t1.execute(a, b, c);

        // Виклик Завдання 2
        Task2 t2 = new Task2();
        System.out.println("\n--- Введення даних для Завдання 2 ---");
        System.out.print("Введіть X: ");
        double xCoord = scanner.nextDouble();
        System.out.print("Введіть Y: ");
        double yCoord = scanner.nextDouble();
        t2.execute(xCoord, yCoord);

        // Виклик Завдання 3
        Task3 t3 = new Task3();
        System.out.println("\n--- Введення даних для Завдання 3 ---");
        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        t3.execute(num);

        // Виклик Завдання 4.1
        Task4_1 t4_1 = new Task4_1();
        System.out.println("\n--- Введення даних для Завдання 4.1 ---");
        System.out.print("Введіть значення x: ");
        double xFunc = scanner.nextDouble();
        t4_1.execute(xFunc);

        // Виклик Завдання 4.2
        Task4_2 t4_2 = new Task4_2();
        t4_2.execute(scanner); // Передаємо існуючий сканер для меню

        scanner.close();
    }
}
