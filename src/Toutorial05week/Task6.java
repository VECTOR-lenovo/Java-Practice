package Toutorial05week;
interface  PowerONOff{
    void turnOff();
    void turnOn();
}

interface DeviceInfo{
    void displayInfo();
}
interface  ElectronicDevice extends PowerONOff,DeviceInfo{

}
class Television implements ElectronicDevice{
    @Override
    public void turnOff(){
        System.out.println("Television is turned off");
    }
    @Override
    public void turnOn(){
        System.out.println("Television is turned on");
    }
    @Override
    public void displayInfo(){
        System.out.println("This is a Television");
    }
}
public class Task6 {
    public static void main(String[] args) {
        Television obj = new Television();
        obj.turnOff();
        obj.turnOn();
        obj.displayInfo();
    }
}
