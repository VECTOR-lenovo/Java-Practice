package workshop5;

abstract class vhicle {
    public abstract void wheel();
    public abstract void door();
}
class bus extends vhicle {
    @Override
    public void wheel() {
        System.out.println("This is wheel of bus");
    }
    public void door() {
        System.out.println("This is door of bus");
    }
}
public class Qno5_6 {
    public static void main(String[] args) {
        bus obj = new bus();
        obj.wheel();
        obj.door();
    }
}
