package Week4;
//class has a method and  attribute of the class
//constructor can change the behavior
public class Main {
    public static void main(String [] args){
        Dog bobby = new Dog();
        bobby.name = "Money";

        bobby.bark();
        Dog buddy = new Dog();
        buddy.name = "Buddy";
        buddy.bark();
    }
}

