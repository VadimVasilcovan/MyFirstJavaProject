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
        boolean allMatch = true;
        String[] result = new String[slotFruits.length];
        Random random = new Random();
        int spins = play(allMatch);

        for(int spinCount = 0; spinCount <spins; spinCount++){
            for(int i = 0; i < slotFruits.length; i++)
                for(int j = 0; j < 1; j++){
                    randomElement = random.nextInt(slotFruits[i].length);
                    result[i] = slotFruits[i][randomElement];
                }
            for(String res : result){
                System.out.print(res);
            }



            do{
                for (int i = 0; i< result.length; i++){
                    if (!result[i].equals(result[0])) {
                        allMatch = false;
                        System.out.println("the elements are not the same you loose your money");
                        break;
                    }
                }

            }while(allMatch);
        }


    }


       static int play (boolean allMatch){
        double yourAmount;
        double yourBet = 0;
        double yourGain = yourBet * 5;
        int spinRepetition ;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your bet: ");
            yourBet =scanner.nextDouble();


            do{
                System.out.println("You want to spin 1 0r 10 times");
                spinRepetition = scanner.nextInt();
                if(spinRepetition != 1 && spinRepetition !=10){
                    spinRepetition = 0;
                    System.out.println("this is not a valid number please enter 1 or 10");
                }
            }while (spinRepetition != 1 && spinRepetition != 10);
            scanner.close();
           return spinRepetition;



    }
}
