package Toutorial04week;

class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double area() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
public class Qno5 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}

