package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class  AuroraNational implements CentralSystem {
    private static final Logger log = LogManager.getLogger();

    //Passing the DB connection to the class
    private Connection ANBConnector;
    public AuroraNational(Connection ANBConnector) {
        this.ANBConnector = ANBConnector;
    }

    public String customerID() throws SQLException {
        // Implementation for returning the customer ID
        String customerID = null;
        try {
            //Statement object used for executing SQL statements are runtime
            Statement CustomerIDStatement = ANBConnector.createStatement();
            //Executing a query
            String sql = "SELECT customer_id FROM dbo.Customers";

            ResultSet CustomerID_RS = CustomerIDStatement.executeQuery(sql);

            //Processing results
            if (CustomerID_RS.next()) {
                customerID = CustomerID_RS.getString("customer_id");
                log.info("Customer ID: " + CustomerID_RS.getString("customer_id"));
            }
            //Close resources
            CustomerID_RS.close();
            CustomerIDStatement.close();
        } catch (Exception e) {
            log.error("Error retrieving Customer ID from database: ");
            log.error(e.getMessage());
        }
        return customerID;
    }

    public String accountPasscode() throws SQLException{
        String accountPasscode = null;
        try{
            Statement accountPasscodeSt = ANBConnector.createStatement();
            String sql = "SELECT passcode FROM dbo.Customers";
            ResultSet AccountPasscode_RS = accountPasscodeSt.executeQuery(sql);

            if(AccountPasscode_RS.next()) {
                accountPasscode = AccountPasscode_RS.getString(("passcode"));
                log.info("Passcode Found");
            }
            accountPasscodeSt.close();
            AccountPasscode_RS.close();
        }catch (Exception e) {
            log.error("Error finding passcode for user");
            log.error(e.getMessage());
        }
        return accountPasscode;
    }

    public String bankName() throws SQLException{
        // Implementation for returning the bank name
        String bankName = null;
        try{
            Statement bankNameStatement = ANBConnector.createStatement();
            String sql = "SELECT bank_name FROM dbo.Accounts";
            ResultSet bankName_RS = bankNameStatement.executeQuery(sql);

            if (bankName_RS.next()){
                bankName = bankName_RS.getString("bank_name");
                log.info("Bank name: "+ bankName_RS.getString("bank_name"));
            }
            bankName_RS.close();
            bankNameStatement.close();
            }
        catch (Exception e) {
            log.error("Error retrieving bank name");
            log.error(e.getMessage());
        }
        return bankName;
    }

    public String accountHolderInfo() throws SQLException{
        // Implementation for displaying account holder information
        //Name, Address, Email
        return "Account Holder Information";
    }

    public long accountNumber() throws SQLException{
        // Implementation for returning the account number
        return 0; // Placeholder return value
    }

    public long accountBalance() throws SQLException{
        // Implementation for displaying account information

        //Balance
        return 0; // Placeholder return value
    }

    public void deposit(long amount) throws SQLException{
        // Implementation for depositing an amount
    }

    public void withdraw(long amount) throws SQLException{
        // Implementation for withdrawing an amount
    }

    public void createAccount() throws SQLException{
        // Implementation for creating an account
    }

    public void deleteAccount() throws SQLException{
        // Implementation for deleting an account
    }

    public long search(String accountNumber) throws SQLException {
        // Implementation for searching an account by account number
        return 0; // Placeholder return value
    }

}
