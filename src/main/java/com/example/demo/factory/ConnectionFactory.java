package com.example.demo.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            String host="localhost";
            String database= "maracuja";
            String user= "root";
            String password= "";
            String url= "jdbc:mysql://" + host + "/"+ database;
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }
}
