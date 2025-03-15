package homework;
/*
练习：创建一个Animal类，包含一个makeSound()方法。然后创建Dog和Cat类继承自Animal类，
并重写makeSound()方法。编写一个方法，接受Animal对象并调用其makeSound()方法。
*/
public class HomeWork04 {
    public static void main(String[] args){
        Animal a1 = new Dog();
        a1.makeSound();

        Animal a2 = new Cat();
        a2.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.println("Can make some noise!");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Can wangwang!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Can meomeo!");
    }
}

