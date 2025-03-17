package workshop;
import java.util.Scanner;
public class Qno08 {
	 int mark1, mark2, mark3, mark4, mark5, totalmarks;
	    float percentage;

	    public static void main(String[] args) {
	        Qno08 mainInstance = new Qno08();
	        mainInstance.inputMarks();
	        mainInstance.calculateGrade();
	    }

	    public void inputMarks() {
	        Scanner marks = new Scanner(System.in);
	        System.out.println("Enter marks for Physics: ");
	        mark1 = marks.nextInt();
	        System.out.println("Enter marks for Chemistry: ");
	        mark2 = marks.nextInt();
	        System.out.println("Enter marks for Biology: ");
	        mark3 = marks.nextInt();
	        System.out.println("Enter marks for Mathematics: ");
	        mark4 = marks.nextInt();
	        System.out.println("Enter marks for Computer: ");
	        mark5 = marks.nextInt();
	    }

	    public void calculateGrade() {
	        totalmarks = mark1 + mark2 + mark3 + mark4 + mark5;
	        percentage = (float) totalmarks / 500 * 100;
	        if (percentage >= 90) {
	            System.out.println("You scored A with " + percentage + "%");
	        } else if (percentage >= 80) {
	            System.out.println("You scored B with " + percentage + "%");
	        } else if (percentage >= 70) {
	            System.out.println("You scored C with " + percentage + "%");
	        } else if (percentage >= 60) {
	            System.out.println("You scored D with " + percentage + "%");
	        } else if (percentage >= 40) {
	            System.out.println("You scored E with " + percentage + "%");
	        } else {
	            System.out.println("You failed with " + percentage + "%");
	        }
	    }
}
