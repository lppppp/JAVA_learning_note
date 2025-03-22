import java.util.List;
import java.util.ArrayList;
/*编写一个程序，使用 List 接口的常用方法完成以下任务：

创建一个 List 集合（使用 ArrayList 实现）。
向集合中添加 5 个元素（例如：1, 2, 3, 4, 5）。
打印集合的第三个元素。
在索引 2 的位置插入元素 10。
移除索引 4 的元素。
打印修改后的集合。*/
public class HomeWork02 {
    public static void main(String[] args){
        //创建一个 List 集合（使用 ArrayList 实现）
        List<Integer> l1 = new ArrayList<>();
        //创建一个 List 集合（使用 ArrayList 实现）
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        //打印集合的第三个元素
        System.out.println("集合第三个元素是："+l1.get(2));
        //在索引 2 的位置插入元素 10
        l1.add(2,10);
        //移除索引 4 的元素
        l1.remove(4);
        //打印修改后的集合
        for(Integer i:l1){
            System.out.println(i);
        }
    }
}
