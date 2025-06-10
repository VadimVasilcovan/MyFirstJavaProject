import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        //while loop = repeat some code forever
        // while some condition remains true


        String name = "";
        Scanner scanner = new Scanner(System.in);

        while(name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name.toUpperCase());
        scanner.close();
    }
}
