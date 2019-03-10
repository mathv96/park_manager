package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    public Connection getConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://172.22.0.2/Park_manager","root", "melomartins96");
        }catch(Exception error){
            throw new RuntimeException("Erro 1: "+error);
        }
    }
}