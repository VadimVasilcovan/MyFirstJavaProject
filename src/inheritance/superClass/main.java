package inheritance.superClass;

public class main {
    public static void main(String[] args){
        // super = Reference to the parent class (subclass <- superclass
        // used in constructors and methods overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Tom", "Potter", 3.25);
        person.showName();

        student.showName();
        System.out.println(student.gpa);

        student.showGPA();
        Employee employee = new Employee("Rubeus", "Hagrid", 2400);

        employee.showSalary();
    }
}
