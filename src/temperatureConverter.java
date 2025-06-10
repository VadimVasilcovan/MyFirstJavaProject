import java.util.Scanner;
public class temperatureConverter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double temperature;
        double newTemp;


        String convertCToF;
        System.out.print("Enter the temperature");
        temperature = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F)");
        convertCToF = scanner.next().toUpperCase();

        newTemp = (convertCToF.equals("C")) ? (temperature -32) * 5/9 : (temperature * 9.0 / 5.0) + 32 ;
        System.out.println(temperature);
        System.out.println(convertCToF);
        System.out.printf("%.2f %s",newTemp, convertCToF);


        scanner.close();
    }
}
