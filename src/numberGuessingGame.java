import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int input;
        int attempts = 1;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max+1);
        System.out.println(randomNumber);
        System.out.printf("Guess a number between %d-%d: ", min, max);
        input = scanner.nextByte();
        do {
            System.out.printf("%d attempts\n", attempts);
            attempts ++;
            if (input < randomNumber){
                System.out.println("go up");
            }else {
                System.out.println("go down");
            }
            System.out.print("Enter a guess: ");
            input = scanner.nextInt();
            }while (input != randomNumber);
        System.out.println("done");
        scanner.close();
    }
}
