package workshop1;
import java.math.BigInteger;
import java.util.Scanner;

public class QNo01 {
	String name;
    int age;
    BigInteger number;

    public static void main(String[] args) {
        QNo01 mainInstance = new QNo01();
        mainInstance.takeinput();
        mainInstance.displayoutput();
    }

    public void takeinput() {
        Scanner infos = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = infos.nextLine();
        System.out.println("Enter age: ");
        age = infos.nextInt();
        System.out.println("Enter number: ");
        number = infos.nextBigInteger();
    }

    public void displayoutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);

    }
}