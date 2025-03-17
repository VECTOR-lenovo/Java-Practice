package workshop;
import java.util.Scanner;
public class Qno10 {
	 int i, j;

	    public static void main(String[] args) {
	        Qno10 mainInstance = new Qno10();
	        mainInstance.Pattern_print();
	    }

	    public void Pattern_print() {
	        for (j = 1; j <= 5; j++) {
	            for (i = 1; i <= j; i++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
