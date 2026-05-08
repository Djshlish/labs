package LAB_8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task1 {
    private String fileName;
    private int minRange;
    private int maxRange;

    // Конструктор приймає параметри з командного рядка
    public Task1(String fileName, int minRange, int maxRange) {
        this.fileName = fileName;
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public void execute() {
        File file = new File(fileName);
        
        try {
            // Перевірка існування файлу
            if (!file.exists()) {
                System.out.println("Файл " + fileName + " не існує. Створюємо новий...");
                file.createNewFile();
            } else {
                System.out.println("Файл " + fileName + " вже існує. Дані будуть перезаписані.");
            }

            // Використання FileWriter для символьного запису у файл
            try (FileWriter writer = new FileWriter(file)) {
                Random random = new Random();
                int count = 15; // Кількість чисел для генерації
                
                for (int i = 0; i < count; i++) {
                    // Формула для генерування випадкового числа в межах [b1, b2]
                    int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                    writer.write(randomNumber + " ");
                }
                System.out.println("Завдання 1: Успішно записано " + count + " випадкових чисел у діапазоні [" + minRange + ", " + maxRange + "].");
            }
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}
