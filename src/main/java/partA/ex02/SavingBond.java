package partA.ex02;

import java.util.Scanner;

public class SavingBond {
    private String investorName;
    private double initialDeposit;
    private double annualYield;
    private int investmentPeriod, remainingMonths;
    private static final Scanner userInput = new Scanner(System.in);

    public void inputDeposit() {
        System.out.println("Specify the amount you wish to invest:");
        System.out.print("Enter amt: ");
        initialDeposit = userInput.nextDouble();
        System.out.println();
    }

    public void chooseInvestmentPlan() {
        System.out.println("Select your growth fund plan:");
        System.out.println("1-11 months: 0.5% return");
        System.out.println("12-23 months: 1.0% return");
        System.out.println("24-35 months: 1.5% return");
        System.out.println("36-47 months: 2.0% return");
        System.out.println("48-60 months: 2.5% return");
        System.out.print("Enter the number of months: ");
        investmentPeriod = userInput.nextInt();

        if (investmentPeriod < 1 || investmentPeriod > 60) {
            System.out.println("Invalid. Please enter a duration between 1 and 60 months.");
            return;
        }

        switch (investmentPeriod / 12) {
            case 0 -> annualYield = 0.005;
            case 1 -> annualYield = 0.010;
            case 2 -> annualYield = 0.015;
            case 3 -> annualYield = 0.020;
            default -> annualYield = 0.025;
        }

        remainingMonths = investmentPeriod;
        System.out.println("You have selected a " + remainingMonths + "-month growth fund plan with a " + (annualYield * 100) + "% return rate.");
    }

    public void applyMonthlyGrowth() {
        if (remainingMonths > 0) {
            initialDeposit += initialDeposit * annualYield / 12;
            remainingMonths--;

            System.out.println("\nUpdated investment details:");
            System.out.printf("New Balance: $%.2f%n", initialDeposit);
            System.out.printf("Annual Return Rate: %.2f%%%n", annualYield * 100);
            System.out.println("Months Remaining: " + remainingMonths);
        }
    }

    public void projectFinalValue() {
        System.out.println("\nWould you like to see the projected value of your investment?");
        System.out.println("(1) Yes, show projection");
        System.out.println("(2) No, exit");
        int choice = userInput.nextInt();

        if (choice == 1) {
            System.out.println("Projected balance over time with a " + (annualYield * 100) + "% return rate:");
            double forecastedBalance = initialDeposit;
            int monthCount = 1;
            while (monthCount <= remainingMonths) {
                forecastedBalance += forecastedBalance * annualYield / 12;
                System.out.printf("Month %d projected balance: $%.2f%n", monthCount, forecastedBalance);
                monthCount++;
            }
        } else {
            System.out.println("We appreciate your trust in our growth fund services! Have a prosperous day!");
        }
    }
}
