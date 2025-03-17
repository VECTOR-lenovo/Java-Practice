package workshop1;
import java.util.Scanner;
public class QNo5 {
	float length, breadth, perimeter;

    public static void main(String[] args) {
        QNo5 mainInstance = new QNo5();
        System.out.println("Perimeter of rectangle");
        mainInstance.takeSides();
        mainInstance.displayPerimeter();
    }

    public void takeSides() {
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sides.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = sides.nextFloat();
    }

    public void displayPerimeter() {
        perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of rectangle is: " + String.format("%.2f", perimeter));
    }
}
