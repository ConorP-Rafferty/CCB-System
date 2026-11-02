package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        //Implementing multiple database connections


        //AURORA NATIONAL CONNECTION
        String AuroraUrl = "jdbc:sqlserver://localhost;"
                + "instanceName=SQLDEV;"
                + "databaseName=ANB-Database;"
                + "user=sa;"
                + "password=YourPassword;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
        try (Connection AuroraConnect = DriverManager.getConnection(AuroraUrl)) {
            log.info("Connected to: Aurora National Database Successfully");
            AuroraNational auroraNational = new AuroraNational(AuroraConnect);
        } catch (SQLException e) {
            log.error("Failed to connect to: Aurora Nation Database");
            //Gets error message:
            log.error(e.getMessage());
        }

        //MERIDIAN TRUST CONNECTION
        String MeridianUrl = "jdbc:sqlserver://localhost\\SQLDEV;"
                + "databaseName=MTB-Database;"
                + "integratedSecurity=true;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
        try (Connection MeridianConnect = DriverManager.getConnection(MeridianUrl)) {
            log.info("Connected to: Meridian Trust Database Successfully");
            MeridianTrust meridianTrust = new MeridianTrust(MeridianConnect);
        } catch (SQLException e) {
            log.error("Failed to connect to: Meridian Trust Database");
            //Gets error message:
            log.error(e.getMessage());
        }

        //SUMMIT CAPITAL CONNECTION
        String SummitUrl = "jdbc:sqlserver://localhost\\SQLDEV;"
                + "databaseName=SCB-Database;"
                + "integratedSecurity=true;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
        try (Connection SummitConnect = DriverManager.getConnection(SummitUrl)) {
            log.info("Connected to: Summit Capital Database Successfully");
            SummitCapital summitCapital = new SummitCapital(SummitConnect);
        } catch (SQLException e) {
            log.error("Failed to connect to: Summit Capital Database");
            //Gets error message:
            log.error(e.getMessage());
        }

    }
}
