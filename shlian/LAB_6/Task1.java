package LAB_6;

class Person {
    String fullName;
    int age;

    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " йде.");
    }

    public void talk() {
        System.out.println("Такий-то " + fullName + " говорить.");
    }
}

public class Task1 {
    public static void run() {
        Person p1 = new Person();
        Person p2 = new Person("Maksym Shved", 20); // Ініціалізація конструктором з параметрами
        
        p1.talk();
        p2.move();
    }
}
