import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

/*编写一个程序，使用 Collection 接口的常用方法完成以下任务：

创建一个 Collection 集合（使用 ArrayList 实现）。
向集合中添加 5 个元素（例如："A", "B", "C", "D", "E"）。
打印集合的大小。
判断集合中是否包含元素 "C"。
移除元素 "D"。
使用迭代器遍历集合并打印所有元素。*/
public class HomeWork01 {
    public static void main(String[] args){
        //创建一个 Collection 集合（使用 ArrayList 实现）。
        Collection<String> c1 = new ArrayList<>();
        //向集合中添加 5 个元素
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");
        System.out.println(c1.size());
        //打印集合的大小
        System.out.println(c1.contains("A"));
        //移除元素 "D"
        c1.remove("D");
        //使用迭代器遍历集合并打印所有元素
        Iterator<String> iterator = c1.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
        //使用foreach遍历集合并打印所有元素
        for(String s:c1){
            System.out.println(s);
        }
    }
}


