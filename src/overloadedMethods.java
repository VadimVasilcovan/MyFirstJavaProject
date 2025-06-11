public class overloadedMethods {
    public static void main(String[] args){
        //overloaded methods = methods that share the same name,
        // but different parameters
        // signature = name + parameters

        /*System.out.println(add(1, 2, 3);*/
        String pizza = bakePizza("flat bread", "mozarella ", "pepperonni");
        String huizza = bakePizza("flat bread", "mozarella ");

        System.out.println((pizza));
        System.out.println((huizza));
    }

/*    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b;
    }*/

    static String bakePizza(String bread){
        return bread + " pizza";

    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";

    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";

    }
}
