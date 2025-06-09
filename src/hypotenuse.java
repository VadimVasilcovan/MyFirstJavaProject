import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        //hypotenuse c=Math.sqrt(a^2 + b^2

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;


        System.out.println("Enter the length of A side: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of B side: ");
        b = scanner.nextDouble();
        c =Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("the result is " + c + "cm");
        scanner.close();
    }
}
