package org.example;//CENTRAL INTERFACE FOR THE BANKING SYSTEM

import java.sql.SQLException;

public interface CentralSystem {
    String bankName() throws SQLException;
    String accountHolderInfo() throws SQLException;
    String accountPasscode() throws SQLException;
    long accountNumber() throws SQLException;
    long accountBalance() throws SQLException;
    void deposit(long amount) throws SQLException;
    void withdraw(long amount) throws SQLException;
    void deleteAccount() throws SQLException;
    void createAccount() throws SQLException;
    long search(String accountNumber) throws SQLException;
}