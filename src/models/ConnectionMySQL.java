package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionMySQL {
    private String database_name = "pharmacy_database";
    private String user = "root";
    private String password = "root123456";
    private String url = "jdbc:mysql://localhost:3306" + database_name;
    Connection conn = null;

    public Connection getConnection(){
        try{
            // Obtain driver value
            Class.forName("com.mysql.cj.jdbv.Driver");
            // Obtain the connection
            conn = DriverManager.getConnection(url, user, password);         
        }catch(ClassNotFoundException e){
            System.err.println("An ClassNotFoundExveption has ocurred" + e.getMessage());
        }catch(SQLException e){
            System.err.println("An SQLException has ocurred" + e.getMessage());
        }
        return conn;
    }
}
