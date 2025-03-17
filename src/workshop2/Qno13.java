package workshop;
import java.util.Scanner;
public class Qno13 {
	int k = 10;

    public static void main(String[] args) {
        Qno13 mainInstance = new Qno13();
        mainInstance.displayNumbers();
    }

    public void displayNumbers() {
        while (k < 20) {
            if (k == 15) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
    }

}
