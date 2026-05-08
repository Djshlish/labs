package LAB_2;

import java.util.Scanner;

public class Task4_2 {
    public void execute(Scanner scanner) {
        System.out.println("\n--- Завдання 4.2 (Текстове меню) ---");
        System.out.println("1 - Вивести привітання");
        System.out.println("2 - Запрошення до роботи на комп'ютері");
        System.out.println("3 - Завершити роботу");
        System.out.print("Оберіть пункт меню: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Привіт! Раді вас бачити.");
                break;
            case 2:
                System.out.println("Запрошуємо до плідної роботи на комп'ютері!");
                break;
            case 3:
                System.out.println("Роботу завершено. До побачення!");
                break;
            default:
                System.out.println("Невірний вибір. Спробуйте ще раз.");
                break;
        }
    }
}
