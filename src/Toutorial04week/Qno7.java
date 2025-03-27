package Toutorial04week;

class AreaCalculator {
    // Method to calculate the area of a rectangle
    public void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    // Overloaded method to calculate the area of a square
    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }

    // Overloaded method to calculate the area of a triangle
    public void areacalculate(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
}
public class Qno7 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}