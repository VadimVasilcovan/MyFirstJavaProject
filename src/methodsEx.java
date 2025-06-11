public class methodsEx {
    public static void main(String[] args){


        boolean ageVerification = ageCheck((19));
        System.out.println(ageVerification);
    }

    static boolean ageCheck(int age){
        return  age >=18;
    }
}
