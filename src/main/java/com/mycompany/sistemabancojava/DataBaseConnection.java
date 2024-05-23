package com.mycompany.sistemabancojava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConnection {
    // Conexão com o bando de dados:
    public static Connection getConnection() throws SQLException {
        try{
           String url = "jdbc:mysql://localhost:3306/dadosclientes";
            String user = "root";
            String password = "";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
    }
}
     
  
   
    
