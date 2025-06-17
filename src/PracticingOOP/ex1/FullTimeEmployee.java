package PracticingOOP.ex1;

public class FullTimeEmployee extends Employee {

   public  FullTimeEmployee(String name, int id, double salary){
       super(name, id, salary);
   }
    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
}
