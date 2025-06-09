import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        //hypotenuse c=Math.sqrt(a^2 + b^2

        Scanner scanner = new Scanner(System.in);

     /*   double a;
        double b;
        double c;


        System.out.println("Enter the length of A side: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of B side: ");
        b = scanner.nextDouble();
        c =Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("the result is " + c + "cm");

        //circumference = 2 * Math.PI * radius.
    */
       /* double radius;
        double circumference;

        System.out.print("Add the radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;


        System.out.println("the circumference is: " + circumference);*/

      /*  double area;
        double radius;

        System.out.println("write the area: ");
        radius = scanner.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        System.out.println( "the area is:" + area);*/



        double radius;
        double volume;

        System.out.print("add radius: ");
        radius = scanner.nextDouble();


        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("the result is: " + volume + "m^2");



        scanner.close();


    }
}
