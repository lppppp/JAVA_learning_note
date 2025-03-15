package homework;
/*练习：创建一个抽象类Vehicle，包含一个抽象方法start()。然后创建Car和Motorcycle类继承自Vehicle类，并实现start()方法。*/
public class HomeWork05 {
    public static void main(String[] args){
        Vehicle v1 = new Car();
        v1.start();

        Vehicle v2 = new Motorcycle();
        v2.start();
    }
}
//定义抽象类
abstract class Vehicle{
    //定义抽象方法
    abstract void start();
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car start");
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("Motorcycle start");
    }
}