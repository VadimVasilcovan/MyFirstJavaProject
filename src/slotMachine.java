import java.util.Random;
import java.util.Scanner;

public class slotMachine {

    public static void main(String[] args){
        String[][] slotFruits = {{"🍒","🍋","🍇","⭐","🍎"},
                {"🍒","🍋","🍇","⭐","🍎"},
                {"🍒","🍋","🍇","⭐","🍎"},
                {"🍒","🍋","🍇","⭐","🍎"},
                {"🍒","🍋","🍇","⭐","🍎"}};
        int randomElement;
        boolean allMatch;
        String[] result = new String[slotFruits.length];
        Random random = new Random();


        GameInput input = play();

        double yourBet = input.yourBet;
        int spins = input.spinRepetition;
        double yourAmount = 0;
        double yourGain = yourBet * 5;

        for(int spinCount = 0; spinCount < spins; spinCount++){
            allMatch = true;

            for(int i = 0; i < slotFruits.length; i++){
                randomElement = random.nextInt(slotFruits[i].length);
                result[i] = slotFruits[i][randomElement];
            }

            for(String res : result){
                System.out.print(res);
            }
            System.out.println();

            for (int i = 0; i < result.length; i++){
                if (!result[i].equals(result[0])) {
                    allMatch = false;

                    System.out.println("The elements are not the same, you lose your money.");
                    break;
                }
            }

            if(allMatch){
                yourAmount += yourGain;
                System.out.println("All elements match! You win " + yourGain);
            }
        }

        System.out.println("Total amount won: " + yourAmount);
        System.out.println("Want to try one more time yes/no?");

    }

    static class GameInput {
        double yourBet;
        int spinRepetition;

        GameInput(double bet, int spins) {
            yourBet = bet;
            spinRepetition = spins;
        }
    }

    static GameInput play(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your bet: ");
        double yourBet = scanner.nextDouble();

        int spinRepetition;
        do{
            System.out.println("You want to spin 1 or 10 times");
            spinRepetition = scanner.nextInt();
            if(spinRepetition != 1 && spinRepetition != 10){
                System.out.println("This is not a valid number. Please enter 1 or 10.");
            }
        } while (spinRepetition != 1 && spinRepetition != 10);
        
        return new GameInput(yourBet, spinRepetition);
    }
}
