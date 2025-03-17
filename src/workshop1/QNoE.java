package workshop1;
import java.util.Scanner;
public class QNoE {
    float USD, rate;
    double convertedAmount;

    public static void main(String[] args) {
        QNoE converter = new QNoE();
        converter.inputValues();
        converter.displayConvertedAmount();
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in USD: ");
        USD = scanner.nextFloat();
        System.out.println("Enter the exchange rate: ");
        rate = scanner.nextFloat();
    }

    public void displayConvertedAmount() {
        convertedAmount = USD * rate;
        System.out.println("The converted amount is: " + convertedAmount);
    }

}
