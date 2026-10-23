package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        //Implementing multiple database connections

        //AURORA NATIONAL CONNECTION
        String AuroraUrl = "jdbc:sqlserver://localhost\\SQLDEV;"
                + "databaseName=ANB-Database;"
                + "integratedSecurity=true;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
        try (Connection AuroraConnect = DriverManager.getConnection(AuroraUrl)) {
            System.out.println("Connected to: Aurora National Database Successfully");
            AuroraNational auroraNational = new AuroraNational(AuroraConnect);
        } catch (SQLException e) {
            System.err.println("Failed to connect to: Aurora Nation Database");
            //Gets error message:
            System.err.println(e.getMessage());
        }

        //MERIDIAN TRUST CONNECTION
        String MeridianUrl = "jdbc:sqlserver://localhost\\SQLDEV;"
                + "databaseName=MTB-Database;"
                + "integratedSecurity=true;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
        try (Connection MeridianConnect = DriverManager.getConnection(MeridianUrl)) {
            System.out.println("Connected to: Meridian Trust Database Successfully");
            MeridianTrust meridianTrust = new MeridianTrust(MeridianConnect);
        } catch (SQLException e) {
            System.err.println("Failed to connect to: Meridian Trust Database");
            //Gets error message:
            System.err.println(e.getMessage());
        }

        //SUMMIT CAPITAL CONNECTION
        String SummitUrl = "jdbc:sqlserver://localhost\\SQLDEV;"
                + "databaseName=SCB-Database;"
                + "integratedSecurity=true;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
        try (Connection SummitConnect = DriverManager.getConnection(SummitUrl)) {
            System.out.println("Connected to: Summit Capital Database Successfully");
            SummitCapital summitCapital = new SummitCapital(SummitConnect);
        } catch (SQLException e) {
            System.err.println("Failed to connect to: Summit Capital Database");
            //Gets error message:
            System.err.println(e.getMessage());
        }

    }
}
