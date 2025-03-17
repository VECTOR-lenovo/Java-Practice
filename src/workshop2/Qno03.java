package workshop;
import java.util.Scanner;
public class Qno03 {
	int marks;

    public static void main(String[] args) {
        Qno03 mainInstance = new Qno03();
        mainInstance.takeMarks();
        mainInstance.displayGrade();
    }

    public void takeMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        marks = scanner.nextInt();
    }

    public void displayGrade() {
        if (marks >= 40 && marks < 50) {
            System.out.println("Grade: C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: C+");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: B+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: A");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Fail");
        }
    }
}
