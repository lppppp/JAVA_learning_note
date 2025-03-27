package org.example;

import java.sql.*;

/*编写一个 Java 程序，查询数据库的元数据（如表名、列名、类型等），并打印出数据库中所有表的名称及其列信息。*/
public class JdbcMetadataTest {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbclearn";
        String username = "root";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            //获取基础数据
            DatabaseMetaData metaData = connection.getMetaData();
            //获取表信息
            ResultSet tables = metaData.getTables(null,null,"account",new String[] {"TABLE"});
            System.out.println("数据库中的表为：");
            while(tables.next()){
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("表名："+tableName);
                //获取列信息
                ResultSet columns = metaData.getColumns(null,null,tableName,"%");
                while (columns.next()){
                    String columnName = columns.getString("COLUMN_NAME");
                    String dataType = columns.getString("TYPE_NAME");
                    System.out.println(columnName+" "+dataType);
                }
                columns.close();//关闭资源
            }
            tables.close();//关闭资源

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
