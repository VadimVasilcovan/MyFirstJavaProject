package OOP;

public class Constructors {
    public static void main(String[] args){
        //constructor = A special method to initialize objects
        //You can pass arguments to a constructor
        //and set up initial values

        Student student1 = new Student("SpangeBob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3 = new Student("Bob", 431, 321.2);


        System.out.println((student1.name));
        System.out.println((student2.name));
        System.out.println((student3.name));

        student1.study();
        student2.study();
        student3.study();
    }





}
