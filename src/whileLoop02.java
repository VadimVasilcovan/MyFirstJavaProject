import java.util.Scanner;

public class whileLoop02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            String response= " ";


            while (!response.equals("Q")){
                System.out.println("you are plaing a game");
                System.out.println("press 'Q' to quite" );
                response = scanner.next().toUpperCase();
            }

        System.out.println("game is done");



            scanner.close();
        }
    }

