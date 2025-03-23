import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*编写一个程序，使用 Collections 工具类完成以下任务：

创建一个 List 集合（使用 ArrayList 实现），并添加 5 个整数（例如：1, 2, 3, 4, 5）。
使用 Collections.fill() 将集合中的所有元素替换为 10。
使用 Collections.max() 和 Collections.min() 分别找到集合中的最大值和最小值。
使用 Collections.frequency() 统计集合中元素 10 出现的次数。
打印每次操作后的结果。*/
public class HomeWork08 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //使用 Collections.fill() 将集合中的所有元素替换为 10
        Collections.fill(list,10);
        System.out.println(list);
        //修改集合中两个元素值
        list.set(0,66);
        list.set(4,3);
        System.out.println(list);
        //使用 Collections.max() 和 Collections.min() 分别找到集合中的最大值和最小值
        System.out.println("最大值："+Collections.max(list));
        System.out.println("最小值："+Collections.min(list));
        //使用 Collections.frequency() 统计集合中元素 10 出现的次数
        System.out.println("10出现的次数"+Collections.frequency(list,10));
    }
}
