package inheritance;
public class main {
    public static void main(String[] args){
        //inheritance = One class inherits the attributes and methods
        //              from another class.
        //              Child <- Parent
        //              multilevel inheritance Child <-Parent <- GrandParent



        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        cat.eat();
        dog.eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();

                Plant plant = new Plant();

                plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
