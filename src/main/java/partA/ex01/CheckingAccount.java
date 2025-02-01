package partA.ex01;

public class CheckingAccount {
    public String name;
    public double balance;

    public void deposit(double x) {
        balance += x;
    }

    public void displayCustomer() {
        System.out.println("Customer's name: " + name);
        System.out.println("Customer's Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.name = "Steph";
        account.deposit(500.0);
        account.displayCustomer();
    }
}
