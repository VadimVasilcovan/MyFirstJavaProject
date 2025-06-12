import java.util.Scanner;

public class searchAnArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 9, 2, 8, 3, 5};
        String[] fruits = {"apple", "orange", "banana"};
        String target;
        boolean isFound = false;


        System.out.print("search : ");
        target = scanner.nextLine();

        for(int i = 0; i<fruits.length;i++){
            if (fruits[i].equals(target.toLowerCase())){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }

        }
        if(!isFound){
            System.out.println("nothing was found");
        }
        scanner.close();
    }
}
