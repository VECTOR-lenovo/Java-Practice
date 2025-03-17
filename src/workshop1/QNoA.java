package workshop1;
import java.util.Scanner;
public class QNoA {
	int firstNum, secondNum;
    int sum, difference, product, quotient, remainder;

    public static void main(String[] args) {
        QNoA mainInstance = new QNoA();
        mainInstance.inputNumbers();
        mainInstance.displaycalculations();
    }

    public void inputNumbers() {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNum = numbers.nextInt();
        System.out.println("Enter second number: ");
        secondNum = numbers.nextInt();
    }

    public void displaycalculations() {
        sum = firstNum + secondNum;
        difference = firstNum - secondNum;
        product = firstNum * secondNum;
        quotient = firstNum / secondNum;
        remainder = firstNum % secondNum;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
