import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int principalAmount;
        double rate;
        int timesPerYear;
        int  years;
        double amount;

        System.out.println("Enter the amount: ");
        principalAmount = scanner.nextInt();

        System.out.println("Enter the interest rate (in%): ");
        rate = scanner.nextDouble();

        System.out.println("Enter the # of times computed per year: ");
        timesPerYear =scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principalAmount * Math.pow(1+ rate/timesPerYear, timesPerYear * years);

        System.out.printf("the amount after %d years is $%.2f",years, amount);
        scanner.close();
    }
}
