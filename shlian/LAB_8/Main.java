package LAB_8;

public class Main {
    public static void main(String[] args) {
        // Перевірка наявності потрібної кількості параметрів командного рядка
        if (args.length < 3) {
            System.out.println("Помилка: Недостатньо аргументів командного рядка.");
            System.out.println("Правильне використання: java Main <ім'я_файлу.txt> <початок_діапазону> <кінець_діапазону>");
            System.out.println("Наприклад: java Main result.txt -10 50");
            return;
        }

        try {
            // Зчитування аргументів командного рядка
            String fileName = args[0];
            int minRange = Integer.parseInt(args[1]);
            int maxRange = Integer.parseInt(args[2]);

            // Виклик логіки першого завдання
            Task1 task1 = new Task1(fileName, minRange, maxRange);
            task1.execute();

            // Виклик логіки другого завдання
            Task2 task2 = new Task2(fileName);
            task2.execute();

        } catch (NumberFormatException e) {
            System.err.println("Помилка: Параметри діапазону (другий та третій аргументи) повинні бути цілими числами.");
        }
    }
}
