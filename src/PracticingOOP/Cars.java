package PracticingOOP;

public class Cars extends Store {

double hp;
double engineCapacity;

public Cars(int numOfCars, int numOfBike, double hp, double engineCapacity){
    super(numOfCars, numOfBike);
    this.hp = hp;
    this.engineCapacity = engineCapacity;


}

    public void carDetails(){
        System.out.println("Number of Cars: " + numOfCars);
    }
}
