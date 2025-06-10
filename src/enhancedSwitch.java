import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args){
        // Enhanced switch = A replacement to many else if statements
        // (Java14 feature)

        Scanner scanner = new Scanner(System.in);
        String day;


        System.out.println("Write your day");
        day = scanner.nextLine().toLowerCase();
        switch (day){
            case
                    "monday" ,"tuesday", "wednesday", "thursday" ,"friday" ->
                    System.out.println("It is a weekday");
            case
                    "saturday","sunday" ->
                    System.out.println("It is the weekend");

            default -> System.out.printf("'%s' is not a day", day);
        }

        scanner.close();
    }
}
