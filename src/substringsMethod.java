public class substringsMethod {
    public static void main(String[] args) {
        //.substring() A method used to extract a portion of a string
        //.substring(start, end)

        String email = "Bro123@gmail.com";
     //        String userName = email.substring(0, 6);
    //       String domaine = email.substring(7);



        String userName = email.substring(0, email.indexOf("@"));
        String domaine = email.substring(email.indexOf("@")+1);

        System.out.println(userName);
        System.out.println(domaine);
    }
}
