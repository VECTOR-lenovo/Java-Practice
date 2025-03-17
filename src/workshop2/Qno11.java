package workshop;
import java.util.Scanner;
public class Qno11 {
	int num, j, factorial = 1;

    public static void main(String[] args) {
        Qno11 mainInstance = new Qno11();
        mainInstance.inputNum();
        mainInstance.displayFactorial();
    }

    public void inputNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
    }

    public void displayFactorial() {
        for (j = 1; j <= num; j++) {
            factorial *= j;
        }
        System.out.println("Factorial of " + num + ": " + factorial);
    }
}
