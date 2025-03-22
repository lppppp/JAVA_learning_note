import java.util.HashSet;
import java.util.Set;
/*编写一个程序，使用 Set 接口的常用方法完成以下任务：

创建一个 Set 集合（使用 HashSet 实现）。
向集合中添加 5 个元素（例如："Apple", "Banana", "Cherry", "Apple", "Durian"）。
打印集合的大小。
判断集合中是否包含元素 "Cherry"。
移除元素 "Banana"。
打印修改后的集合。*/
public class HomeWork03 {
    public static void main(String[] args){
        //创建一个 Set 集合（使用 HashSet 实现）
        Set<String> s1 = new HashSet<>();
        //向集合中添加 5 个元素,重复元素不会被添加
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Cherry");
        s1.add("Apple");
        s1.add("Durian");
        //打印集合的大小
        System.out.println("集合大小为："+s1.size());
        //判断集合中是否包含元素 "Cherry"
        System.out.println("是否包含‘Cherry’:"+s1.contains("Cherry"));
        //移除元素 "Banana"
        s1.remove("Banana");
        //打印修改后的集合
        System.out.println("修改后集合元素:"+s1);
    }
}
