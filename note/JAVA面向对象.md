### 🤖 Assistant

### 第一周：面向对象编程

#### 1. 知识讲解
**类和对象**
- **类**：类是对象的蓝图或模板，定义了对象的属性（字段）和行为（方法）。
- **对象**：对象是类的实例，具有状态和行为。

**继承**
- 继承是面向对象编程的一个特性，允许一个类继承另一个类的属性和方法。
- 子类可以重写父类的方法，也可以添加新的属性和方法。

**多态**
- 多态允许不同类的对象对同一消息做出响应。
- 通过方法重写和方法重载实现多态。

**封装**
- 封装是将对象的属性和方法包装在一起，并隐藏内部实现的细节。
- 通过访问修饰符（如private、public、protected）控制访问级别。

#### 2. 代码样例
```java
// 定义一个简单的类
class Animal {
    private String name;

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    // 方法
    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

// 继承Animal类
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // 重写父类方法
    @Override
    public void speak() {
        System.out.println(getName() + " barks");
    }

    // 新增方法
    public void fetch() {
        System.out.println(getName() + " fetches the ball");
    }
}

// 测试类
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        myAnimal.speak();

        Dog myDog = new Dog("Buddy");
        myDog.speak();
        myDog.fetch();
    }
}
```

#### 3. 注意和提醒
- **命名规范**：类名应使用大驼峰命名法（CamelCase），方法名和变量名应使用小驼峰命名法（camelCase）。
- **访问控制**：合理使用访问修饰符，确保封装性。
- **方法重写**：子类重写父类方法时，应使用`@Override`注解，以确保正确重写。

#### 4. 编程训练
**题目**：设计一个简单的银行账户管理系统
- 创建一个`BankAccount`类，包含以下属性和方法：
    - 属性：账户号码（accountNumber）、账户余额（balance）
    - 方法：存款（deposit）、取款（withdraw）、显示余额（displayBalance）
- 创建一个`SavingsAccount`类，继承`BankAccount`类，并添加以下功能：
    - 属性：利率（interestRate）
    - 方法：计算利息（calculateInterest）
- 在`Main`类中测试你的实现，创建几个账户并进行存款、取款和利息计算操作。

**示例代码结构**：
```java
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();

        SavingsAccount savingsAccount = new SavingsAccount("654321", 2000, 5);
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();
    }
}
```

通过以上学习和练习，您将能够掌握面向对象编程的基本概念，并能够应用到实际编程中。祝您学习愉快！