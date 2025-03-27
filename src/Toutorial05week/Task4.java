package Toutorial05week;
interface Employee{
    public void printEmployeeid ();
    public void printsalary ();
}
class Manager implements Employee {
    @Override
    public void printEmployeeid(){
        System.out.println("Employee id is 654");
    }
    @Override
    public void printsalary(){
        System.out.println("Salary is $5000");
    }
}
class Developer implements Employee{
    @Override
    public void printEmployeeid(){
        System.out.println("Employee id is 54");
    }
    @Override
    public void printsalary(){
        System.out.println("Salary is $2450");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        Developer obj2 = new Developer();
        obj1.printEmployeeid();
        obj1.printsalary();
        obj2.printEmployeeid();
        obj2.printsalary();
    }
}
