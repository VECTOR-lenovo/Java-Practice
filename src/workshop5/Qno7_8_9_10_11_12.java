package workshop5;

interface Animal {
    void eat();
    void walk();
}
interface printable {
    void display();
}
class Cow implements Animal, printable{
    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }
    @Override
    public void walk() {
        System.out.println("Cow walks on four legs");
    }
    @Override
    public void display() {
        System.out.println("Cow is a domestic animal");
    }
}
interface Livingbeing{
    void Specialfeature();
}
class fish implements Livingbeing{
    @Override
    public void Specialfeature() {
        System.out.println("Fish can live in water");
    }
}
class Bird implements Livingbeing{
    @Override
    public void Specialfeature() {
        System.out.println("Bird can fly");
    }
}
public class Qno7_8_9_10_11_12 {
    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.eat();
        obj.walk();
        obj.display();
        fish ob = new fish();
        ob.Specialfeature();
        Bird objs = new Bird();
        objs.Specialfeature();
    }
}