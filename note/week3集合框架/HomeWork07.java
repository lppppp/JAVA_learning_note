import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*编写一个程序，结合 Iterator 和 Collections 工具类完成以下任务：

创建一个 List 集合（使用 ArrayList 实现），并添加 5 个字符串（例如："Apple", "Banana", "Cherry", "Durian", "Elderberry"）。
使用 Collections.sort() 对集合进行排序。
使用 Iterator 遍历集合并打印所有元素。
使用 Collections.binarySearch() 查找元素 "Cherry" 的索引。
打印查找结果。*/
public class HomeWork07 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Durian");
        list.add("Elderberry");
        //使用 Collections.sort() 对集合进行排序
        Collections.sort(list);
        //使用 Iterator 遍历集合并打印所有元素
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s1 = iterator.next();
            System.out.println(s1);
        }
        //使用 Collections.binarySearch() 查找元素 "Cherry" 的索引
        System.out.println(Collections.binarySearch(list,"Cherry"));

    }
}
