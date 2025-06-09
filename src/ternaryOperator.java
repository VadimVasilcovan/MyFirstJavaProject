import org.w3c.dom.ls.LSOutput;

public class ternaryOperator {
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
    String passOrFail;

    passOrFail = (score>=70)? "Pass" : "fail";


    int number = 4;
    String evenOrOdd = (number%2 == 0) ? "even" : "false";


        System.out.println(passOrFail);
        System.out.println(evenOrOdd);

    }
}
