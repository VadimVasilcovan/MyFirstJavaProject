import java.util.Scanner;

public class weightConverter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        boolean kgToIb;

        System.out.print("Insert the weight: ");
        weight = scanner.nextDouble();
        System.out.print("do you want to convert kg to ib? (y/n) : ");
        kgToIb = scanner.nextBoolean();

        System.out.println(weight);
        System.out.println(kgToIb);

        if(kgToIb){
            weight *= 2.20462;
            System.out.printf("%.2f", weight);
        }else{
            weight %= 2.20462;
            System.out.printf("%.2f", weight);
        }

        scanner.close();
    }
}
