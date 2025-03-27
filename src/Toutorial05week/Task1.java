package Toutorial05week;

abstract  class parent {
    public void message(){
        System.out.println("This is parent class");
    }

}
class childclass1 extends parent{
    @Override
     public void message(){
        System.out.println("This is first subclass");
    }
}
class childclass2 extends parent{
    @Override
     public void message(){
        System.out.println("This is second subclass");
    }
}
public class Task1 {
    public static void main(String[] args) {
        childclass1 obj1 = new childclass1();
        childclass2 obj2 = new childclass2();
        obj1.message();
        obj2.message();
    }
}