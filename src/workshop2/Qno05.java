package workshop;
import java.util.Scanner;
public class Qno05 {
	 char choice;

	    public static void main(String[] args) {
	        Qno05 mainInstance = new Qno05();
	        mainInstance.inputCause();
	        mainInstance.displayEligibility();
	    }

	    public void inputCause() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Do you have a medical cause? (y/n): ");
	        choice = scanner.next().charAt(0);
	    }

	    public void displayEligibility() {
	        if (choice == 'y') {
	            System.out.println("You are not allowed to sit in the exam.");
	        } else if (choice == 'n') {
	            System.out.println("You can sit in the exam.");
	        } else {
	            System.out.println("Invalid input.");
	        }
	    }
}
