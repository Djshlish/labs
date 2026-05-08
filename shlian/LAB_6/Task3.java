package LAB_6;

class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super((4.0 / 3.0) * Math.PI * Math.pow(radius, 3), radius);
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super((1.0 / 3.0) * s * h);
        this.s = s;
        this.h = h;
    }
}

public class Task3 {
    public static void run() {
        Cylinder cylinder = new Cylinder(5, 10);
        Ball ball = new Ball(7);
        Pyramid pyramid = new Pyramid(25, 12);

        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
    }
}
