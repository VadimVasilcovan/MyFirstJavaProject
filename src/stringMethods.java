public class stringMethods {
    public static void main(String[] args){

        String name = "Bro Code";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");
       // boolean isContain = name.contains("a");
        name = name.toUpperCase();
        name = name.toLowerCase();

        //to eliminate empty spaces
        name = name.trim();

        name = name.replace("o", "a");

        //method to check if the string is empty or not
        //name.isEmpty();


        boolean check = name.isEmpty();
        // to ignore case-sensitive
        //IgnoreCase
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.printf("Hello %s\n", name);
        }

        System.out.println(check);
    }
}
