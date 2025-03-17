package workshop1;
import java.util.Scanner;
public class QNo9 {
	 float principle, rate, time;
	    double interest;

	    public static void main(String[] args) {
	        QNo9 mainInstance = new QNo9();
	        mainInstance.takeVal();
	        System.out.println(" ");
	        mainInstance.displaytotalInterest();
	    }

	    public void takeVal() {
	        Scanner values = new Scanner(System.in);
	        System.out.println("Enter total principle amount: ");
	        principle = values.nextFloat();
	        System.out.println("Enter rate of interest: ");
	        rate = values.nextFloat();
	        System.out.println("Enter time: ");
	        time = values.nextFloat();
	    }

	    public void displaytotalInterest() {
	        interest = (principle * rate * time) / 100;
	        System.out.println("The  total simple interest is: " + interest);
	    }
}
