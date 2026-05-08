package LAB_8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    private String fileName;

    // Конструктор отримує ім'я файлу для читання
    public Task2(String fileName) {
        this.fileName = fileName;
    }

    public void execute() {
        File file = new File(fileName);

        // Перевірка існування файлу перед читанням
        if (!file.exists()) {
            System.err.println("Помилка: Файл " + fileName + " не знайдено для читання.");
            return;
        }

        // Використання FileReader для символьного читання з файлу
        try (FileReader reader = new FileReader(file)) {
            System.out.println("\n--- Завдання 2: Читання даних з файлу " + fileName + " ---");
            int character;
            
            // Посимвольне зчитування
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n---------------------------------------------------");
        } catch (IOException e) {
            System.err.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}
