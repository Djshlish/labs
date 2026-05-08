package LAB_2;

public class Task3 {
    public void execute(int number) {
        System.out.println("\n--- Завдання 3: Аналіз числа ---");
        int absNum = Math.abs(number);
        boolean isTwoDigit = (absNum >= 10 && absNum <= 99);
        boolean isEven = (number % 2 == 0);

        if (isTwoDigit && isEven) {
            System.out.println("Число " + number + " є двозначним і парним.");
        } else {
            System.out.println("Число " + number + " НЕ відповідає заданим умовам.");
        }
    }
}
