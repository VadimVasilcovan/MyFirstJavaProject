import java.util.Scanner;

public class bankingProgram {
    public static void main(String[] args){
        int customerChoice;
        double balance = 20;
        double depositAmount = 0;
        double withdrawAmount = 0;
        boolean isOpen = true;



        Scanner scanner = new Scanner(System.in);

    do{
        System.out.println("========================");
        System.out.println("Banking Program");
        System.out.println("========================");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw Balance");
        System.out.println("4. Exit");
        System.out.println("========================");
        System.out.println("Enter your choice: (1-4)");
        customerChoice = scanner.nextInt();

        switch(customerChoice){
            case 1 -> showBalance(balance);
            case 2 -> { balance += depositMoney(depositAmount);
                System.out.printf("New balance: %.2f\n", balance);}

            case 3 ->{ balance -= withdrawMoney(withdrawAmount);
                System.out.printf("New balance: %.2f\n", balance);
            }
            case 4 -> isOpen = !isOpen;


        }
    }while (isOpen);

        scanner.close();
    }


    static void showBalance(double balances){
        System.out.printf("Your current balance is %.2f", balances);
    }

    static double depositMoney(double deposit){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how match you want to deposit");
                deposit =scanner.nextDouble();
        return deposit;

    }

    static double withdrawMoney(double withdrawAmount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how match you want to withdraw ");
    withdrawAmount = scanner.nextDouble();

        return withdrawAmount;
    }






}
