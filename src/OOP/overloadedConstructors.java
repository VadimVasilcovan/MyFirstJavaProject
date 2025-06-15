package OOP;

public class overloadedConstructors {
   public static void main(String[] args){
       User user1 = new User("Spongebob");
       User user2 = new User("Spongebob", 13);



       System.out.println(user1.userName);
       System.out.println(user1.email);
       System.out.println(user1.age);



       System.out.println(user2.userName);
       System.out.println(user2.email);
       System.out.println(user2.age);
   }


}
