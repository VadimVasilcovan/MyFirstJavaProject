import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        double width = 0;
        double length = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter rectangle Length : ");
        length = scanner.nextDouble();


        System.out.print("enter rectangle width : ");
         width = scanner.nextDouble();


         area = width * length;


        System.out.println( "rectangle area is " + area + "cm^2");

        scanner.close();
/*
        //common java problem whe we declare a number before string
        System.out.println("your age");
        int yourAge = scanner.nextInt();
        //to solve ad this line
        scanner.nextLine();

        System.out.println("your name");
        String yourName = scanner.nextLine();


        System.out.println("you are " + yourAge + " Y old");
        System.out.println("your name" + yourName);
        //string user input
        System.out.print("Enter your name: ");
       String name = scanner.nextLine();

        //double user input
        System.out.print("What is your gpa: ");
        double gpa =  scanner.nextDouble();

        //integer user input
        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        //boolean user input
        System.out.println("are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        System.out.println();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + "y old");
        if (isStudent){
            System.out.println("you are a student");
        }else{
            System.out.println("you aren't the student");
        }
        */
    }
}

//data types
//int-integer 1,2,3
//double-non integer 1.12, 2,32, ...
//char



/*
 //THIS IS MY FIRST JAVA PROGRAM
        System.out.print("I like Pizza!\n");
        System.out.print("It's really good\n");
        System.out.print("Buy me pizza!\n");





    int age = 30;
    double average = 3.4;
    char grade = 'a';
    char symbol = '!';
    char currency = '$';
    boolean isStudent = true;
    boolean isOnline = false;

        System.out.print("he is " + age + " years old\n");

        String name = "Bro code";
        System.out.println("Hello " + name);
        */