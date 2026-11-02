package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

public class SummitCapital implements CentralSystem {
    private static final Logger log = LogManager.getLogger();

    //Passing the DB connection to the class
    private Connection SCBConnector;
    public SummitCapital(Connection SCBConnector) {
        this.SCBConnector = SCBConnector;
    }

    public String customerID() throws SQLException{
        // Implementation for returning the customer ID
        return "Customer ID";
    }

    public String accountPasscode() throws SQLException{
        return null;
    }

    public String bankName() throws SQLException{
        // Implementation for returning the bank name
        return "Bank Name";
    }

    public String accountHolderInfo() throws SQLException{
        // Implementation for displaying account holder information
        //Name, Address, Phone Number, Email
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

    public String cardType() throws SQLException{
        // Implementation for returning the card type
        return "Card Type";
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