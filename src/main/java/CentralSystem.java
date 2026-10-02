//CENTRAL INTERFACE FOR THE BANKING SYSTEM

interface CentralSystem {
    String customerID();
    String bankName();
    String accountHolderInfo();
    long accountNumber();
    long accountBalance();
    void deposit(long amount);
    void withdraw(long amount);
    void deleteAccount();
    void createAccount();
    long search(String accountNumber);
}