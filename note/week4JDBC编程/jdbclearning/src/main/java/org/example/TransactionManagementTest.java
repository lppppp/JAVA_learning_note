package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*题目：编写一个 Java 程序，模拟转账操作。从 account 表中扣除用户 A 的余额，并增加用户 B 的余额。
要求：
使用事务管理，确保两个操作要么同时成功，要么同时失败。
处理 SQLException 异常，并在失败时回滚事务。*/
public class TransactionManagementTest {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbclearn";
        String username = "root";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            connection.setAutoCommit(false);
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            try(PreparedStatement pst1 = connection.prepareStatement(sql1);
                PreparedStatement pst2 = connection.prepareStatement(sql2)){
                pst1.setDouble(1,20);
                pst1.setInt(2,1);
                int rowsAffected1 = pst1.executeUpdate();// 执行插入

                pst2.setDouble(1,20);
                pst2.setInt(2,2);
                int rowsAffected2 = pst2.executeUpdate();// 执行插入
                //提交
                connection.commit();
            }catch(SQLException e){
                connection.rollback();
                e.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
