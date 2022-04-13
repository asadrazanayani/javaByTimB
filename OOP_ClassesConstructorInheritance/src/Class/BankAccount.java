package Class;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructors can be overloaded
    //it is best not to call the setters method in the constructor. This is cause we want the fields to be initialized first. 

    public BankAccount() {
        this(0,0,"default name","default email","(000) 000 0000"); // calling
        System.out.println("Default Constructor called");
    }



    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(String customerName) {
        this.customerName = customerName;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(0,0,customerName, email, phoneNumber);
        System.out.println("three parameters constructor called");
    }

    private boolean validFund(double amount) {
        if (amount <= balance) {
            return true;
        } else {
            return false;
        }
    }

    public void depositFunds(double amount) {
        if (amount > 0) {
            balance+=amount;
            System.out.println("Deposit Completed. New balance is " + balance);
        } else {
            System.out.println("Cannot deposit negative amount");
        }
    }

    public void withdrawalFunds(double amount) {
        if (validFund(amount)) {
            if (amount > 0) {
                balance -= amount;
                System.out.println("Withdrawal Completed. New balance is " + balance);
            } else {
                System.out.println("Cannot withdraw negative amount");
            }
        } else {
            System.out.println("Cannot complete the transaction. Insufficient funds.");
        }
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
