package Toutorial05week;
interface shapes {
    void calculateArea();
}
 class Circle implements shapes {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
     class Rectangle implements shapes {
          int length, width;

         public Rectangle(int length, int width) {
             this.length = length;
             this.width = width;
         }

         @Override
         public void calculateArea() {
             int area = length * width;
             System.out.println("Area of rectangle: " + area);
         }
     }


public class Task5 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        obj1.calculateArea();
        Rectangle obj2 = new Rectangle(5,6);
        obj2.calculateArea();
    }
}



