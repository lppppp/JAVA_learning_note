package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*题目：编写一个 Java 程序，向 users 表中批量插入 100 条记录。
要求：
使用 PreparedStatement 的批处理功能。
使用事务管理，确保所有插入操作成功后才提交事务。
处理 SQLException 异常。*/
public class BatchProcessingTest {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbclearn";
        String username = "root";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            //关闭自动提交
            connection.setAutoCommit(false);
            String sql = "insert into users values(?,?,?)";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                //批量设置数据
                for(int i = 1;i<=100;i++){
                    preparedStatement.setInt(1, i);
                    preparedStatement.setString(2, "testuser");
                    preparedStatement.setString(3, "password");
                    preparedStatement.addBatch();//将SQL 语句添加到批处理中
                }
                //执行批处理,返回一个 int[] 数组
                int[] results = preparedStatement.executeBatch();
                // 提交事务
                if(results.length==100){
                    connection.commit();
                }else{
                    connection.rollback();
                }
                //打印批量处理结果
                for (int i = 0; i < results.length; i++) {
                    System.out.println("Statement " + (i + 1) + " result: " + results[i]);
                }

            }catch(SQLException e){
                connection.rollback();//回滚事务
                e.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
