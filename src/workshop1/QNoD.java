package workshop1;
import java.util.Scanner;
public class QNoD {
	int quantity;
    float pricePerItem;
    double Cost;

    public static void main(String[] args) {
        QNoD mainInstance = new QNoD();
        mainInstance.inputData();
        mainInstance.displayCost();
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of items: ");
        quantity = scanner.nextInt();
        System.out.println("Enter price per item: ");
        pricePerItem = scanner.nextFloat();
    }

    public void displayCost() {
        Cost = quantity * pricePerItem;
        System.out.println("The total cost is: " + Cost);
    }
}
