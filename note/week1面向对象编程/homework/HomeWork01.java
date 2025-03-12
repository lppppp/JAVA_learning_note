package homework;
/*编写类A01，定义方法max，实现求某个方法的最大值，并返回*/
public class HomeWork01 {
    public static void main(String[] args){
        A01 a1 = new A01();
        double[] arr = {77,99,187};
        System.out.println(a1.max(arr));
    }
}
//创建类
class A01{
    public double max(double[] a){
        double m = 0;
        for(int i=0;i<a.length;i++){
            if(m<a[i]){
                m = a[i];
            }
        }
        return m;
    }
}