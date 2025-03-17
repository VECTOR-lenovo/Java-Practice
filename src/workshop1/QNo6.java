package workshop1;
import java.util.Scanner;
public class QNo6 {
	 double length, area;

	    public static void main(String[] args) {
	        QNo6 mainInstance = new QNo6();
	        System.out.println(" ");
	        mainInstance.inputSide();
	        System.out.println(" ");
	        mainInstance.displaytotalArea();
	    }

	    public void inputSide() {
	        Scanner side = new Scanner(System.in);
	        System.out.println("Enter side: ");
	        length = side.nextDouble();
	    }

	    public void displaytotalArea() {
	        area = Math.pow(length, 2);
	        System.out.println("The total area of the square is: " + area);
	    }
}
