package workshop1;
import java.util.Scanner;

public class QNo7 {
	double celsius, fahrenheit;

    public static void main(String[] args) {
        QNo7 mainInstance = new QNo7();
        mainInstance.taketempinCelsius();
        mainInstance.taketempinFahrenheit();
    }

    public void taketempinCelsius() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        celsius = value.nextDouble();
    }

    public void taketempinFahrenheit() {
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
