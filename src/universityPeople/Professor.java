package universityPeople;

public class Professor extends Person{
    String subject = "an subject";

    Professor(String name, String age, String subject){
        super(name, age);
        this.subject = subject;

    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println(subject);
    }
}
