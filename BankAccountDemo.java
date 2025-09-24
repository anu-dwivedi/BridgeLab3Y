// Base class: BankAccount
class BankAccount2 {
    String accountNumber;
    double balance;

    public BankAccount2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount2 extends BankAccount {
    double interestRate;

    public SavingsAccount2(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount2 extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount2(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount2 extends BankAccount {
    int maturityPeriod; // in months

    public FixedDepositAccount2(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

// Test class to demonstrate
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV12345", 75000, 3.5);
        savings.displayDetails();
        savings.displayAccountType();

        CheckingAccount checking = new CheckingAccount("CHK12345", 40000, 20000);
        checking.displayDetails();
        checking.displayAccountType();

        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD12345", 100000, 24);
        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();
    }
}
