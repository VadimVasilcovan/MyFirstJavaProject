import java.util.Scanner;

public class rockPaperScissorGame {
    public static void main(String[] args){
        String userInput;
        int machineRandom;
        String[] machineOptions = {"rock", "paper", "scissor"};
        int wins = 0;
        String playAgain = "yes";
            Scanner scanner = new Scanner(System.in);



        do{
            for (int i = 0; i<3; i++){
                System.out.print("Chose rock, paper or scissor ");
                userInput = scanner.nextLine().toLowerCase();
                machineRandom = (int) (Math.random() * 3);
                String machineChoice = machineOptions[machineRandom];

                if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissor")) {
                    System.out.println("Invalid input. Try again.");
                    i--;
                    continue;
                }
                if(userInput.equals(machineChoice)){
                    System.out.println("It's a draw.");
                    System.out.println(wins);
                }else if(
                        (userInput.equals("scissor") && machineChoice.equals("paper")) ||
                                (userInput.equals("paper") && machineChoice.equals("rock")) ||
                                (userInput.equals("rock") && machineChoice.equals("scissor"))
                ){
                    System.out.println("You winn");
                    wins ++;
                    System.out.println(wins);
                }else{
                    System.out.println("you lose");
                    System.out.println(wins);
                }




            }
            System.out.print("Do you want to play again? 'yes/no': ");
        playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));
        System.out.println("See u next time mate");
        scanner.close();
    }
}
