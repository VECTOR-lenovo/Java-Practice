package workshop3;
import java.util.Objects;
import java.util.Scanner;
 class lamp {
     boolean ison = false;

     public void turnOn() {
         ison = true;
         System.out.println("Lamp has been turned on");
     }

     public void turnOff() {
         ison=false;
         System.out.println("Lamp has been turned off");
     }
 }

public class Qno06 {
    String choice;
    lamp lamp = new lamp();

    public static void main(String[] args) {
        Qno06 mainInstance = new Qno06();
        mainInstance.toggleLight();
    }

    public void toggleLight() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type on/off to toggle lamp light, 'q' to exit: ");
            choice = scanner.next();
            if (Objects.equals(choice, "on")) {
                lamp.turnOn();
            } else if (Objects.equals(choice, "off")) {
                lamp.turnOff();
            } else if (Objects.equals(choice, "q")) {
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
