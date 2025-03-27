package Toutorial04week;

class person {
    String name;
    int age;

    public person(String name,int age) {

        this.name = name;
        this.age = age;
    }
}

class employee extends person {
    int employeeID;

    public employee(int employeeID,String name,int age) {
        super(name,age);
        this.employeeID = employeeID;

    }

}
public class Qno1{
        public static void main(String[] args) {
            Qno1 quest= new Qno1();
            quest.printdetails();
        }
        public void printdetails(){
            employee emp = new employee(1,"John",25);
            System.out.println("Employee ID: "+emp.employeeID);
            System.out.println("Name: "+emp.name);
            System.out.println("Age: "+emp.age);
        }

}
