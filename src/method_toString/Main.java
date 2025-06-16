package method_toString;

public class Main {
    public static void main(String[] args){
        // .toString() = Method inherited from the Object class.
        //        Used to return a string representation of an object.
        //        By default, it returns a hash code as a unique identifier.
        //        It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        System.out.println(car1);

        Car car2 = new Car("Chevrolet", "Mustang", 2020, "black" );
        System.out.println(car2);



    }
}
