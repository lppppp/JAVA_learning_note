public class AccountTest {
    public static void main(String[] args){
        //创建对象
        BankAccount b1 = new BankAccount("TEST001",89000);
        double bal = b1.deposit(200);//存款
        System.out.println(bal);

        //创建对象
        SavingsAccount s1 = new SavingsAccount("TEST002",10000);
        s1.setInterestRate(0.2);//设置利率
        s1.withdraw(9000);//取款
        s1.displayBalance();//显示余额
        double interest = s1.calculateInterest();//计算利息
        System.out.println(s1.getAccountNumber()+":"+interest);
    }

}

//创建BankAccount类
class BankAccount{

    private String accountNumber;
    private double balance;
    //创建构造方法
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //getter方法获取账号
    public String getAccountNumber(){
        return this.accountNumber;
    }
    //getter方法获取余额
    public double getBalance(){
        return this.balance;
    }
    //存款
    public double deposit(double dep){
        return this.balance = this.balance + dep;
    }
    //取款
    public double withdraw(double wit){
        return this.balance = this.balance - wit;
    }
    //显示余额
    public void displayBalance(){
        System.out.println(this.accountNumber+":"+this.balance);
    }
}

//创建子类
class SavingsAccount extends BankAccount{
    private double interestRate;
    //创建构造方法
    public SavingsAccount(String accountNumber,double balance){
        super(accountNumber,balance);//调用父类构造方法
    }
    //setter方法设置利率
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    //getter方法获取利率
    public double getInterestRate(){
        return this.interestRate;
    }
    //计算利息
    public double calculateInterest(){
        return getBalance() * interestRate;
    }

}