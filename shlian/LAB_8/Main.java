package LAB_8;

public class Main {
    public static void main(String[] args) {
        String filename = "txt.txt";
        int lowerbound = 1;
        int upperbound = 9;

        if (args.length < 3) {
            filename = "LAB_8/src" + args[0];
            lowerbound = Integer.parseInt(args[1]);
            upperbound = Integer.parseInt(args[2]);
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
