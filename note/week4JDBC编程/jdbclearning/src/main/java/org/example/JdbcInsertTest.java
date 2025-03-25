package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*编写一个 Java 程序，更新 users 表中指定 id 的记录的 password 字段。*/
public class JdbcInsertTest {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbclearn";
        String user = "root";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,user,password)){
            connection.setAutoCommit(false);

            try(PreparedStatement prst = connection.prepareStatement("insert into users value(?,?,?)")){
                prst.setInt(1,3);
                prst.setString(2,"成龙");
                prst.setString(3,"223456");
                int rowsAffected = prst.executeUpdate();
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
