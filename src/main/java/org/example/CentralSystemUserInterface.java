package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;


public class CentralSystemUserInterface {

    private Connection ANBConnector;
    public CentralSystemUserInterface(Connection ANBConnector) {
        this.ANBConnector = ANBConnector;
    }

    private static final Logger log = LogManager.getLogger();

    public boolean getCustomerID() throws SQLException {
        Scanner customerIDScanner = new Scanner(System.in);
        log.info("Please enter your customer ID: ");
        String customerIDSearch = customerIDScanner.nextLine().trim();

        return false;
    }


    public boolean passwordCheck() {
        //Checks user entered password is correct for the user ID specified,
        // If correct, access is granted

        return false;
    }

}