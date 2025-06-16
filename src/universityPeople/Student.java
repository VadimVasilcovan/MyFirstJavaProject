package universityPeople;

public class Student extends Person{
    String studentId = "312312";

    Student(String name, String age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }
        void getInfo(){
        super.getInfo();
            System.out.println("Student ID: " + studentId);
        }
}
