package workshop1;

import java.util.Scanner;
public class QNoB {
	float miles;
    double kilometers;

    public static void main(String[] args) {
        QNoB mainInstance = new QNoB();
        mainInstance.inputMiles();
        mainInstance.displayKilometers();
    }

    public void inputMiles() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the distance in mile: ");
        miles = value.nextFloat();
    }

    public void displayKilometers() {
        kilometers = miles * 1.60934f;
        System.out.println(miles + " miles = " + kilometers + " km");
    }
}