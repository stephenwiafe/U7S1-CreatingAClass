package partA.ex01;

public class SavingAccountExample {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void deposit(int x){
        balance += x;
    }

    public void displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }
}
