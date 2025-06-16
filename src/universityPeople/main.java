package universityPeople;

public class main {
    public static void main(String[] args){

        Student student = new Student("Antonio", "25", "312312");

       student.getInfo();

       Professor professor = new Professor("Max","25", "any subjects" );

       professor.getInfo();
    }
}
