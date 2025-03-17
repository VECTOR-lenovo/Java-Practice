package workshop;
import java.util.Scanner;
public class Qno02 {
	int number, i;

    public static void main(String[] args) {
        Qno02 mainInstance = new Qno02();
        mainInstance.inputNumber();
        mainInstance.displayTable();
    }
    public void inputNumber(){
        Scanner nums = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = nums.nextInt();
    }
    public void displayTable(){
        for (i=1;i<=10;i++){
            System.out.println(number + "*" + i + "=" + number*i); 
        }
    }
}
