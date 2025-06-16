package universityPeople;

public class Person {
    String name = "John";
    String age = "22";

    Person(String name, String age){
        this.name = name;
        this.age =age;
    }

    void getInfo(){
        System.out.println("his name is " + name + " and he is  " + age + "old");
    }
}
