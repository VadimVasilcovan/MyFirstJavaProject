package OOP;

public class User {
    String userName;
    String email;
    int age;


    User(String userName){
        this.userName = userName;
        this.email = "Not provided";
        this.age = 0;
    }


    User(String userName, int age){
        this.userName = userName;
        this.email = "Not provided";
        this.age = age;
    }
}
