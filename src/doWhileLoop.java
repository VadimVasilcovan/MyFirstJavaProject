import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

/*        int age = 0;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        //"do while loop" for begin we execute the code and after check wi the condition is true
      do {
            System.out.println("Your age can not bee negative");
            System.out.println("Enter your age");
            age = scanner.nextInt();
        }  while (age < 0);
        System.out.printf("you are %d years old", age);*/

        int number = 0;

      do {
            System.out.println("Enter a number between 1-10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("Your picked" + number);
        scanner.close();
    }
}
