//定义一个类
class Animal {
    private String name;

    //构造方法
    public Animal(String name){
        this.name = name;
    }

    //getter方法
    public String getName(){
        return name;
    }

    //方法
    public void speak(){
        System.out.println(name + " can make sound!");
    }
}


//继承父类
class Dog extends Animal{
    //构造方法
    public Dog(String name){
        super(name);
    }

    //重写父方法
    @Override
    public void speak(){
        System.out.println(getName() + " barks");
    }

    //子类新增方法
    public void fetch(){
        System.out.println(getName()+" fetch a ball");
    }
}

//测试类
public class Main{
    public static void main(String[] args){
        //新建对象
        Animal a1 = new Animal("cat");
        //调用方法
        a1.speak();

        //新建对象
        Dog d1 = new Dog("旺财");

        String s = d1.getName();
        System.out.println(s);
        d1.speak();
        d1.fetch();
    }
}
