package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
    //Implementing multiple database connections
        String[] dbNames = {"ANB-Database", "MTB-Database", "SCB-Database"};

        for (String dbName : dbNames) {
            String url = "jdbc:sqlserver://localhost\\SQLDEV;"
                    + "databaseName=" + dbName + ";"
                    + "integratedSecurity=true;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
            try (Connection conn = DriverManager.getConnection(url)) {
                System.out.println("Connected to: " + dbName + " Successfully");
            } catch (SQLException e) {
                System.err.println("Failed to connect to: " + dbName);
                //Gets error message:
                System.err.println(e.getMessage());
            }
        }
    }
}
