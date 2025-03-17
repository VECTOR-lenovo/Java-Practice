package workshop1;
import java.util.Scanner;
public class QNoC {
	 float radius, area;

	    public static void main(String[] args) {
	        QNoC mainInstance = new QNoC();
	        System.out.println("Area of circle");
	        mainInstance.inputRadius();
	        mainInstance.diaplaytotalArea();
	    }

	    public void inputRadius() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter radius: ");
	        radius = scanner.nextFloat();
	    }

	    public void diaplaytotalArea() {
	        area = (float) (Math.PI * Math.pow(radius, 2));
	        System.out.println("The area of the circle is: " + String.format("%.2f", area));
	    }
}
