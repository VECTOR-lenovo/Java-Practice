package workshop;
import java.util.Scanner;
public class Qno04 {
	 int age1, age2;

	    public static void main(String[] args) {
	        Qno04 mainInstance = new Qno04();
	        mainInstance.inputages();
	        mainInstance.displayyoungestandoldest();
	    }

	    public void inputages() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter age of the first person: ");
	        age1 = scanner.nextInt();
	        System.out.println("Enter age of the second person: ");
	        age2 = scanner.nextInt();
	    }

	    public void displayyoungestandoldest() {
	        if (age1 > age2) {
	            System.out.println("First person is oldest i.e. " + age1);
	            System.out.println("Second person is youngest i.e. " + age2);
	        } else if (age2 > age1) {
	            System.out.println("First person is youngest i.e. " + age1);
	            System.out.println("Second person is oldest i.e. " + age2);
	        } else {
	            System.out.println("Both are of equal age");
	        }
	    }
}
