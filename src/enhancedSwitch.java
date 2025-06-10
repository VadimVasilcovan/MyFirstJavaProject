public class enhancedSwitch {
    public static void main(String[] args){
        // Enhanced switch = A replacement to many else if statements
        // (Java14 feature)
        String day = "Monday";
        switch (day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
        }
    }
}
