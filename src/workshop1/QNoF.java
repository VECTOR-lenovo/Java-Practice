package workshop1;
public class QNoF {
	 public static void main(String[] args) {
	        QNoF mainInstance = new QNoF();
	        mainInstance.logicalAND();
	        mainInstance.logicalOR();
	        mainInstance.logicalNOT();
	    }

	    public void logicalAND() {
	        if ((5 > 3) && (8 > 5)) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }
	    }

	    public void logicalOR() {
	        if ((5 > 3) || (2 > 5)) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }
	    }

	    public void logicalNOT() {
	        if (5 != 10) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }
	    }
}
