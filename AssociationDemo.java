import java.util.ArrayList;

// Bank class
class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        customer.setBank(this);
    }

    public void showCustomers() {
        System.out.println("Customers in " + name + ":");
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

// Customer class
class Customer {
    String name;
    double balance;
    Bank bank; // Association with Bank

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void viewBalance() {
        System.out.println(name + " has balance: ₹" + balance + " at " + bank.name);
    }
}

// Demonstration
public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Alice", 5000);
        Customer c2 = new Customer("Bob", 10000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        bank.showCustomers();
    }
}