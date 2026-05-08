package LAB_7;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public void run() {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Коваленко", "+380501111111");
        phoneBook.put("Шевченко", "+380672222222");
        phoneBook.put("Бойко", "+380633333333");
        phoneBook.put("Ткаченко", "+380994444444");
        phoneBook.put("Кравченко", "+380975555555");
        phoneBook.put("Мельник", "+380666666666");
        phoneBook.put("Олійник", "+380937777777");
        phoneBook.put("Лисенко", "+380988888888");
        phoneBook.put("Марченко", "+380509999999");
        phoneBook.put("Мороз", "+380670000000");

        System.out.println("--- Список абонентів ---");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Телефон: " + entry.getValue());
        }

        System.out.println("\n--- Пошук абонента ---");
        String searchName = "Бойко";
        if (phoneBook.containsKey(searchName)) {
            System.out.println("Знайдено: " + phoneBook.get(searchName));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        System.out.println("Чи є номер +380672222222? " + phoneBook.containsValue("+380672222222"));

        phoneBook.remove("Мороз");
        System.out.println("\nЗапис 'Мороз' видалено.");

        System.out.println("Кількість записів у книзі після видалення: " + phoneBook.size());
    }
}
