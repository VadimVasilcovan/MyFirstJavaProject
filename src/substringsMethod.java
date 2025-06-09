import java.util.Scanner;


public class substringsMethod {
    public static void main(String[] args) {
        //.substring() A method used to extract a portion of a string
        //.substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String userName;
        String domaine;
     //        String userName = email.substring(0, 6);
    //       String domaine = email.substring(7);

        System.out.println("add your mail adres");
        email = scanner.nextLine();

        if(email.contains("@")){

         userName = email.substring(0, email.indexOf("@"));
         domaine = email.substring(email.indexOf("@")+1);
        System.out.println(userName);
        System.out.println(domaine);
        }else{
            System.out.println("email must contain '@'");
        }
        scanner.close();

    }
}
