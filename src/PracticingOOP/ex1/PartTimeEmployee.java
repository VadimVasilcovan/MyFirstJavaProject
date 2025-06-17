package PracticingOOP.ex1;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, int id, double salary){
        super(name, id, salary);
    }

    @Override
    double calculateBonus() {
        return  salary * 0.1;
    }
}
