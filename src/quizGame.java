import java.util.Scanner;

public class quizGame {
    public static void main(String[] args){
        int userInput;
        String[] questions = {"what is the capital of France",
                "Which planet is known as the Red Planet?",
                "Who wrote the play Romeo and Juliet?"};
        String[][] options = {{"1:Berlin", "2:Madrid", "3:Paris", "4:Rome"},
                {"1: Earth", "2: Mars", "3: Jupiter", "4: Venus"},
                {"1: Charles Dickens", "2: William Shakespeare", "3: Jane Austen", "4: Mark Twain"}
        };
        int[] answers = {3, 2, 2 };
        int score = 0;
        int userChoose;

        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("Hy my boy this is a quiz game");
        System.out.println("**************************************");

        for(int i = 0; i< questions.length;i++){

            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            //System.out.println(answers[i]);
            System.out.println("your answer: " );
            userChoose = scanner.nextInt();
            if(userChoose == answers[i]){
                score ++;
                System.out.println("gud job");
            }else{
                System.out.println("You was wrong");
            }
        }

                System.out.printf("Your score is %d", score);

        System.out.println();



        scanner.close();
    }




}
