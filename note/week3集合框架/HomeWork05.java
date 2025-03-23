import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*编写一个程序，使用 Iterator 完成以下任务：

创建一个 List 集合（使用 ArrayList 实现），并添加 5 个元素（例如："A", "B", "C", "D", "E"）。
使用 Iterator 遍历集合并打印所有元素。
在遍历过程中，移除值为 "C" 的元素。
打印修改后的集合。*/
public class HomeWork05 {
    public static void main(String[] args){
        //创建一个 List 集合（使用 ArrayList 实现）
        List<String> l1 = new ArrayList<>();
        //添加 5 个元素
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        //获取迭代器
        Iterator<String> i1 = l1.iterator();
        // 遍历集合并移除元素
        while(i1.hasNext()){
            String s1 = i1.next();// 获取当前元素
            System.out.println(s1);// 打印当前元素
            if(s1.equals("C")){
                i1.remove();// 移除元素 "C"
            }
        }

        System.out.println(l1);
    }
}
