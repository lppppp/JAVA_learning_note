package homework;
/*编写类Book，定义方法updatePrice,实现更改某书的价格，价格大于150，改为150，大于100，，改为100，否则不变*/
public class HomeWork03 {
    public static void main(String[] args){
        Book b = new Book();
        System.out.println(b.updatePrice(99));
    }
}

class Book{
    public int updatePrice(int price){
        if(price >150){
            return 150;
        } else if (price > 100) {
            return 100;
        }else{
            return price;
        }
    }
}