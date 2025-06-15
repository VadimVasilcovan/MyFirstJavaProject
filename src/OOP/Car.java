package OOP;

import java.sql.SQLOutput;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning =true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning =false;
        System.out.println("The engine is stopped");
    }

    void drive(){
        System.out.println("You drive the: " + make);
    }

    void brake(){
        System.out.println("You brake the: " + make);
    }
}
