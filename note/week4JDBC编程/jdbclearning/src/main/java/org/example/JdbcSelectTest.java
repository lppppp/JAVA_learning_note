package org.example;

import java.sql.*;
/*编写一个 Java 程序，使用 JDBC 连接 MySQL 数据库，查询 users 表中的所有数据，并打印出每条记录的 id 和 username。*/
public class JdbcSelectTest {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbclearn";// 数据库 URL
        String user = "root";// 数据库用户名
        String password = "password";// 数据库密码
        // 使用 try-with-resources 确保资源释放
        try(Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt = connection.prepareStatement("select id, username from users");
            ResultSet rs = pstmt.executeQuery()){
            // 遍历结果集并打印数据
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                System.out.println("id:"+id+";username:"+username);
            }
        }catch (SQLException e){
            e.printStackTrace(); // 处理异常
        }
    }
}
