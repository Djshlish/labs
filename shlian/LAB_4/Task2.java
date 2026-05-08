package LAB_4;

public class Task2 {
    public void execute(int[] numbers) {
        System.out.println("--- Завдання 2 ---");

        System.out.print("Перебір циклом while: ");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("Перебір циклом for: ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        System.out.print("Цикл while (числа тільки з непарним індексом): ");
        int k = 1;
        while (k < numbers.length) {
            System.out.print(numbers[k] + " ");
            k += 2;
        }
        System.out.println();

        System.out.print("Цикл for (числа тільки з парним індексом): ");
        for (int j = 0; j < numbers.length; j += 2) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        System.out.print("Масив у зворотньому порядку: ");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
}
