package workshop;
import java.util.Scanner;
public class Qno12 {
	int a = 10;

    public static void main(String[] args) {
        Qno12 mainInstance = new Qno12();
        mainInstance.displayNumbers();
    }

    public void displayNumbers() {
        while (a < 20) {
            if (a == 15) {
                break;
            }
            System.out.println(a);
            a++;
        }
    }
}
