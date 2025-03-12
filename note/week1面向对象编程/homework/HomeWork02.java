package homework;
/*编写类A02，定义方法find，实现查找某字符串的元素查找，并返回索引，如果找不到返回-1*/
public class HomeWork02 {
    public static void main(String[] args){
        A02 a2 = new A02();
        System.out.println(a2.find("sat", new String[]{"cat", "dog"}));
    }

}

class A02{
    public int find(String res,String[] s){
        for(int i=0;i<s.length;i++){
            if(res.equals(s[i])){
                return i;
            }
        }
        return -1;
    }
}