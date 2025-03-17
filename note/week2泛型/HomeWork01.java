/*题目：
设计一个泛型类 Pair<K, V>，用于存储一对键值对。要求：

类中包含两个私有属性 key 和 value，分别表示键和值。
提供构造方法，用于初始化 key 和 value。
提供 getKey() 和 getValue() 方法，用于获取键和值。
提供 setKey(K key) 和 setValue(V value) 方法，用于设置键和值。
在 main 方法中测试 Pair 类，分别使用 String 和 Integer 作为键值对的类型。*/

public class HomeWork01 {
    public static void main(String[] args){
        //创建泛型类对象
        Pair<Integer,String> p1 = new Pair<>(666,"泛型是什么？");
        System.out.println(p1.getKey()+":"+p1.getValue());
    }
}

class Pair<K,V>{
    private K key;
    private V value;
    //创建构造方法
    public Pair(K key,V value){
        this.key = key;
        this.value = value;
    }
    //创建setter和getter方法
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }
}