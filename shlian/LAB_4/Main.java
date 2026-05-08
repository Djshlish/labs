package LAB_4;

public class Main {
    public static void main(String[] args) {
        // Виконання Завдання 2
        Task2 task2 = new Task2();
        int[] task2Array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        task2.execute(task2Array);

        // Виконання Завдання 3
        System.out.println("\n--- Завдання 3 ---");
        Task3 task3 = new Task3();
        double[] task3Array = {1.5, -2.5, 3.4, 5.1, 10.0};
        double sum = task3.calculateSum(task3Array);
        System.out.println("Сума дійсних елементів масиву: " + sum);

        // Виконання Завдання 4
        System.out.println("\n--- Завдання 4 ---");
        Task4 task4 = new Task4();
        int[] task4Array = {1, -2, 3, 4, -5, 6, 7};
        
        System.out.print("Початковий масив: ");
        for (int num : task4Array) {
            System.out.print(num + " ");
        }
        System.out.println();

        task4.invertOddElementsSign(task4Array);

        System.out.print("Масив після зміни знаку непарних елементів: ");
        for (int num : task4Array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
