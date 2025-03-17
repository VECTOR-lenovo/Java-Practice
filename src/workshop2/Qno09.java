package workshop;
import java.util.Scanner;
public class Qno09 {
	int end, i = 1, sum = 0;

    public static void main(String[] args) {
        Qno09 mainInstance = new Qno09();
        mainInstance.inputRange();
        mainInstance.addEvenNumbers();
    }

    public void inputRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  range of even numbers: ");
        end = scanner.nextInt();
    }

    public void addEvenNumbers() {
        while (i <= 2 * end) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of first " + end + " even nums: " + sum);
    }
}
