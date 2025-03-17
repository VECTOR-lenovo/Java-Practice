package workshop1;
import java.util.Scanner;
public class QNo8 {
	 float radius, height, volume;

	    public static void main(String[] args) {
	        QNo8 mainInstance = new QNo8();
	        System.out.println("Volume of cylinder");
	        System.out.println(" ");
	        mainInstance.takeVals();
	        System.out.println(" ");
	        mainInstance.displayVolume();
	    }

	    public void takeVals() {
	        Scanner values = new Scanner(System.in);
	        System.out.println("Enter radius: ");
	        radius = values.nextFloat();
	        System.out.println("Enter height: ");
	        height = values.nextFloat();
	    }

	    public void displayVolume() {
	        volume = (float) (Math.PI * Math.pow(radius, 2) * height);
	        System.out.println("The volume of the cylinder is: " + String.format("%.2f", volume));
	    }
}
