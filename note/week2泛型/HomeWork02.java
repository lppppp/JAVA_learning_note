/*题目：
设计一个泛型接口 Converter<T, R>，用于将一种类型 T 转换为另一种类型 R。要求：

接口中包含一个抽象方法 R convert(T input)，用于实现类型转换。
创建一个实现类 StringToIntegerConverter，将 String 类型转换为 Integer 类型。
在 main 方法中测试 StringToIntegerConverter 的功能。*/
public class HomeWork02 {
    public static void main(String[] args){
        StringToIntegerConverter s1 = new StringToIntegerConverter();
        System.out.println(s1.convert("678"));
    }
}
//创建泛型接口
interface Converter<T, R>{
    R convert(T input);
}
//实现类
class StringToIntegerConverter implements Converter<String,Integer>{
    @Override
    public Integer convert(String input){
        return Integer.parseInt(input);
    }
}