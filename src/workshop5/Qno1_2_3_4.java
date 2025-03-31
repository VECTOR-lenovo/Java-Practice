package workshop5;

abstract class Shape {
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("This is area of quadrilateral");
    }

    public void calculatePerimeter() {
        System.out.println("This is perimeter of quadrilateral");
    }
}

public class Qno1_2_3_4 {
    public static void main(String[] args) {
        Quadrilateral quad = new Quadrilateral();
        quad.calculateArea();
        quad.calculatePerimeter();
    }
}
