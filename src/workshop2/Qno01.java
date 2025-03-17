package workshop2;
import java.util.Scanner;

public class Qno01 {
	float length, breadth;

    public static void main(String[] args) {
        Qno01 mainInstance = new Qno01();
        mainInstance.inputSides();
        mainInstance.Squareconfirm();
    }

    public void inputSides() {
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sides.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = sides.nextFloat();
    }

    public void Squareconfirm() {
        if (length == breadth) {
            System.out.println("It is  a square");
        } else {
            System.out.println("It is  not  a square");
        }
    }
}
