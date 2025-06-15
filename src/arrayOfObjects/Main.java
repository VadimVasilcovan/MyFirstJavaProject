package arrayOfObjects;

public class Main {
    public static void main(String[] args){
      /*  Car car1 = new Car("Mustang", "red");
        Car car2 = new Car("Ferrari", "pink");
        Car car3 = new Car("Maserati", "black");


          Car[] cars = {car1, car2, car3};*/

         /*   for(int i = 0; 0<cars.length; i++){
                cars[i].drive();
            }*/
        Car[] cars = {new Car("Mustang", "red"),
                           new Car("Ferrari", "pink"),
                           new Car("Maserati", "black")};


        for(Car car: cars){
            car.color = "Blue";
        }

        for(Car car: cars){
            car.drive();
        }
    }
}
