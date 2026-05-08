package LAB_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.execute();

        Task2 task2 = new Task2();
        task2.execute();

        Task3 task3 = new Task3();
        task3.execute();

        Task4 task4 = new Task4();
        task4.execute();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Завдання 5 ---");
        System.out.print("Введіть нижню границю діапазону для пошуку значень: ");
        double minRange = scanner.nextDouble();
        
        System.out.print("Введіть верхню границю діапазону для пошуку значень: ");
        double maxRange = scanner.nextDouble();

        // Передача параметрів в конструктор об'єкта
        Task5 task5 = new Task5(minRange, maxRange);
        task5.executeFor();
        task5.executeWhile();
        
        scanner.close();
    }
}
