package Toutorial05week;

abstract class bank {
    public void getBalance(){
        System.out.println("Balance is 0");
    }
}
class BankA extends bank{
    @Override
    public void getBalance(){
        System.out.println("Balance is $100");
    }
}
class BankB extends bank{
    @Override
    public void getBalance(){
        System.out.println("Balance is $150");
    }
}
class BankC extends bank{
    @Override
    public void getBalance(){
        System.out.println("Balance is $200");
    }
}
public class Task2 {
    public static void main(String[] args) {
        BankA obj1 = new BankA();
        BankB obj2 = new BankB();
        BankC obj3 = new BankC();
        obj1.getBalance();
        obj2.getBalance();
        obj3.getBalance();
    }
}