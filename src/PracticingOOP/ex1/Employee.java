package PracticingOOP.ex1;

public abstract class Employee {
    String name;
    int id;
    double salary;


    abstract double calculateBonus();

    public Employee(String name, int id, double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
    };

    void displayDetails(){
        System.out.println("name: " + name + "id :" +  id + " salary " + salary);
    }
}
