import java.util.Scanner;

public class nestedLoopsex {
    public static void main(String[] args) throws InterruptedException {
        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the # of rows");
        rows = scanner.nextInt();
        System.out.println("Enter the # of columns");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol");
        symbol = scanner.next().charAt(0);

        for (int i = 1; i <=columns; i++){
            for (int j = 1; j<=rows; j++){

                System.out.print(symbol);
                Thread.sleep(300);
            }
        System.out.println();
        }

        scanner.close();;
    }
}
