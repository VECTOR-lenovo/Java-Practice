package workshop1;
import java.util.Scanner;
public class QNo3 {
	int intNum;
    double doubleNum;
    char character;

    public static void main(String[] args) {
        QNo3 mainInstance = new QNo3();
        mainInstance.takeVals();
        mainInstance.diaplayVals();
    }

    public void takeVals() {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter integer: ");
        intNum = values.nextInt();
        System.out.println("Enter decimal: ");
        doubleNum = values.nextDouble();
        System.out.println("Enter character: ");
        character = values.next().charAt(0);
    }

    public void diaplayVals() {
        System.out.println("Integer: " + intNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("Char: " + character);
    }
}
