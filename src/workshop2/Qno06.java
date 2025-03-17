package workshop;
import java.util.Scanner;
public class Qno06 {
	 int number;

	    public static void main(String[] args) {
	        Qno06 mainInstance = new Qno06();
	        mainInstance.inputNum();
	        mainInstance.verifyOddEven();
	    }

	    public void inputNum() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a num: ");
	        number = scanner.nextInt();
	    }

	    public void verifyOddEven() {
	        if (number % 2 == 0) {
	            System.out.println(number + " is even");
	        } else {
	            System.out.println(number + " is odd");
	        }
	    }
}
