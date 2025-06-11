public class methodInJava {
    public static void main(String[] args){
        // methods = a block of reusable code that is executed when called ()

       /* String name ="Vadim";
        int age = 10;
        happyBirthday(name, age);*/

        double results = cube(3);
        String fName = getFullName("Vadim", "Vasilcovan");
        System.out.println(fName);
        System.out.println(results);
        }
         static void happyBirthday(String name, int age){
            System.out.println("Happy Birthday to you!");
            System.out.printf("Happy Birthday dear %s!\n", name);
            System.out.printf("You are %d years old!\n", age);
            System.out.println("Happy Birthday to you!\n");
    }

         static double square(double number){
        return number * number;
    }

         static double cube(double number){
        return number * number * number;
        }

        static String getFullName(String first, String last){
        return first + " " + last;
        }
}
