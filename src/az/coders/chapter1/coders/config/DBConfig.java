package az.coders.chapter1.coders.config;

import java.sql.*;

public class DBConfig {

    public  static Connection connection;


    public static  Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        if(connection ==null){
            return  connection=DriverManager.getConnection(url, "postgres", "postgre123");
        }
        else
            return connection;
    }

}
