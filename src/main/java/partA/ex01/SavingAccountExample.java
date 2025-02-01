package partA.ex01;

public class SavingAccountExample {
    public double balance; //declare the variable balance
    public double interestRate = 0.01;//declare and initialize interest rate with 0.01
    public String name;//declare the variable name

    public void deposit(int x){
        balance += x;
    } //function that adds to the variable balance

    public void displayCustomer(){
        System.out.println("Customer: "+name); //prints out name value
        System.out.println("Balance: " + balance);//prints out balance value
        System.out.println("Rate: " + interestRate);//prints out interestRate value
    }
}