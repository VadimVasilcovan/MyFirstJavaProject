import java.sql.SQLOutput;

public class variableScope {
    static int x = 3;//CLASS
    public static void main(String[] args){
        //variable scope = where a variable can be accessed
        //local variable is variable declared inside a method
        int x =1;// LOCAL
        System.out.println(x);
    doSomething();
    }
    static void doSomething(){
        int x = 2;//THE SAME VARIABLE NAME,
                  // IN JAVA IS OK TO WRITE MORE VARIABLE WITH SAME NAME BUT IN DIFFERENT METHODS
        System.out.println(x);
    }
}
