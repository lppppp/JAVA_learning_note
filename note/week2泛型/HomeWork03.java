import java.util.Arrays;

/*设计一个泛型方法 swap，用于交换数组中两个元素的位置。要求：

方法签名如下：public static <T> void swap(T[] array, int i, int j)
在 main 方法中测试 swap 方法，分别使用 Integer 数组和 String 数组。*/
public class HomeWork03 {
    public static void main(String[] args){
        String[] s = {"s","u","p"};
        Transform.swap(s,1,2);
        System.out.println(Arrays.toString(s));

        Integer[] i = {1,2,3,4};
        Transform.swap(i,2,3);
        System.out.println(Arrays.toString(i));
    }
}

class Transform{
    public static <T> void swap(T[] array, int i, int j){
        if(i<0||j<0||i>=array.length||j>=array.length){
            throw new IllegalArgumentException("Invalid indices");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}