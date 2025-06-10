import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args){
        // && =AND
        // || =OR
        // ! = NOT

       /* double temp = 40;
        boolean isSunny = true;

        if(temp <=30 && temp>=0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("It is SUNNY outside");
        }else if(temp <=30 && temp >=0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("It is not sunny");

        }else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }*/

        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.print("insert username");
        username = scanner.nextLine();
        if(username.length() >= 4 && username.length() <=14 && !username.contains(" ")){
            System.out.println("Every thing is fine");
        }else {
            System.out.println("something went wrong");
        }
        scanner.close();
    }
}
