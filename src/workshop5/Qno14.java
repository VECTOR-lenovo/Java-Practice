package workshop5;

public class Qno14 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Dividing bu 0 is not possible");
        }
    }
}
