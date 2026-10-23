package org.example;
import java.sql.Connection;

public class  AuroraNational implements CentralSystem {

    private Connection ANBConnector;
    public AuroraNational(Connection ANBConnector) {
        this.ANBConnector = ANBConnector;
    }

    private String customerID() {
        // Implementation for returning the customer ID
        return "Customer ID";
    }

    public String bankName() {
        // Implementation for returning the bank name
        return "Bank Name";
    }

    public String accountHolderInfo() {
        // Implementation for displaying account holder information
        //Name, Address, Email
        return "Account Holder Information";
    }

    public long accountNumber() {
        // Implementation for returning the account number
        return 0; // Placeholder return value
    }

    public long accountBalance() {
        // Implementation for displaying account information

        //Balance
        return 0; // Placeholder return value
    }

    public void deposit(long amount) {
        // Implementation for depositing an amount
    }

    public void withdraw(long amount) {
        // Implementation for withdrawing an amount
    }

    public void createAccount() {
        // Implementation for creating an account
    }

    public void deleteAccount(){
        // Implementation for deleting an account
    }

    public long search(String accountNumber) {
        // Implementation for searching an account by account number
        return 0; // Placeholder return value
    }

}

