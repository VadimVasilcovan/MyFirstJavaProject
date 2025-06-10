import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args){
        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.println("select the operator: ");
        operator = scanner.next().charAt(0);

        System.out.println("select the second operator");
        secondNumber = scanner.nextDouble();
        switch (operator){
            case '+' -> result =  firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' ->  result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            default -> System.out.println("there is not valid operation");
        }

        System.out.printf("%.2f %c %.2f = %.2f",firstNumber, operator, secondNumber, result);
        scanner.close();
    }
}
