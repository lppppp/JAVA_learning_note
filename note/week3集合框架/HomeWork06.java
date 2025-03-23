import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*编写一个程序，使用 Collections 工具类完成以下任务：

创建一个 List 集合（使用 ArrayList 实现），并添加 5 个整数（例如：3, 1, 4, 1, 2）。
使用 Collections.sort() 对集合进行排序。
使用 Collections.reverse() 将集合反转。
使用 Collections.shuffle() 将集合随机打乱。
打印每次操作后的集合。*/
public class HomeWork06 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(2);
        //排序
        Collections.sort(list);
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println(list);
        //打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
