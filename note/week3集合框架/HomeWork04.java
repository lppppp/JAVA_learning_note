import java.util.HashMap;
import java.util.Map;
/*编写一个程序，使用 Map 接口的常用方法完成以下任务：

创建一个 Map 集合（使用 HashMap 实现）。
向集合中添加 5 个键值对（例如：("A", 1), ("B", 2), ("C", 3), ("D", 4), ("E", 5)）。
打印键 "C" 对应的值。
判断集合中是否包含键 "F"。
移除键 "D" 对应的键值对。
打印修改后的集合。*/
public class HomeWork04 {
    public static void main(String[] args){
        //创建一个 Map 集合（使用 HashMap 实现）
        Map<String,Integer> m1 = new HashMap<>();
        //向集合中添加 5 个键值对
        m1.put("A",1);
        m1.put("B",2);
        m1.put("C",3);
        m1.put("D",4);
        m1.put("E",5);
        //打印键 "C" 对应的值
        System.out.println("键 \"C\" 对应的值:"+m1.get("C"));
        //判断集合中是否包含键 "F"
        System.out.println("集合中是否包含键 \"F\":"+m1.containsKey("F"));
        //移除键 "D" 对应的键值对
        m1.remove("D");
        //打印修改后的集合
        System.out.println("修改后的集合："+m1);
    }
}
