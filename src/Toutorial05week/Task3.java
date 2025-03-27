package Toutorial05week;

abstract class shape {
    public void getrectanglearea( int length, int breadth) {

    }
    public void getsquarearea( int length0) {

    }
    public void getcirclearea(int radius ) {

    }
}


class area extends shape {
    @Override
    public void getrectanglearea(int length, int breadth) {
        System.out.println("Area of rectangle is " + length * breadth);
    }

    public void getsquarearea(int length) {
        System.out.println("Area of square is " + length * length);
    }

    public void getcirclearea(int radius) {
        System.out.println("Area of circle is " + Math.PI * radius * radius);
    }
}

public class Task3 {
    public static void main(String[] args) {
        area obj1 = new area();
        obj1.getrectanglearea(5,6);
        obj1.getsquarearea(5);
        obj1.getcirclearea(5);
    }
}