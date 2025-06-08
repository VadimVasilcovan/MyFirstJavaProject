import java.util.Random;

public class randomNumbers {
    public static void main(String[] args){
        Random random = new Random();
        int number1;
        int number2;
        int number3;
        boolean trueFalse;
        double number4;
        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);
        number4 = random.nextDouble(1, 7);
        trueFalse = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(trueFalse);
    }
}
