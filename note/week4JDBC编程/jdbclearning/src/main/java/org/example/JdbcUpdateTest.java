package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*编写一个 Java 程序，向 users 表中插入一条新记录（username 和 password 字段）。*/
public class JdbcUpdateTest {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbclearn";
        String user = "root";
        String password = "password";
        // 使用 try-with-resources 确保资源释放
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            // 关闭自动提交，开启事务
            connection.setAutoCommit(false);
            String sql = "update users set password = ? where id = ?";
            // 插入数据
            try(PreparedStatement pst = connection.prepareStatement(sql)){
                pst.setString(1,"99999");// 设置 username
                pst.setInt(2,1);// 设置 password
                int rowsAffected = pst.executeUpdate();// 执行插入
                // 提交事务
                connection.commit();
            }catch(SQLException e){
                // 回滚事务
                connection.rollback();
                e.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
