package homework;
/*练习：创建一个Drawable接口，包含一个draw()方法。
然后创建Circle和Square类实现Drawable接口，并在main方法中创建这些对象并调用draw()方法。*/
public class HomeWork06 {
    public static void main(String[] args){
        Drawable d1 = new Circle();
        d1.draw();

        Drawable d2 = new Square();
        d2.draw();
    }
}

//定义接口
interface Drawable{
    void draw();//方法签名
}

class Circle implements Drawable{
    //实现方法
    @Override
    public void draw(){
        System.out.println("Draw circle");
    }
}

class Square implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draw square");
    }
}