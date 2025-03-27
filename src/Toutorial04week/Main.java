package Toutorial04week;


class A {
    public void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("Class B");
    }
}

class C extends B {
    @Override
    public void display() {
        System.out.println("Class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}