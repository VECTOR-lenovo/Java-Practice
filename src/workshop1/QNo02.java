package workshop1;


public class QNo02 {
	 int difference = 45 - 32;
	    int product = 45 * 32;

	    public static void main(String[] args) {
	        QNo02 mainInstance = new QNo02();
	        mainInstance.displayDifference();
	        mainInstance.printProduct();
	    }

	    public void displayDifference() {
	        System.out.println("The differenc between 32 is: 45 - 32 = " + difference);
	    }

	    public void printProduct() {
	        System.out.println("The product of 45 and 32 is: 45 * 32 = " + product);
	    }
	}

