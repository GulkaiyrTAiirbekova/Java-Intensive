package Week4;
//class has a method and  attribute of the class
//constructor can change the behavior
public class Main {
    public static void main(String [] args){
        Dog bobby = new Dog( "Bobby ");
       // bobby.name = "Money";
        bobby.bark();

        Dog buddy = new Dog("Buddy");
        buddy.bark();

        System.out.println(Dog.count);
        System.out.println(bobby.getCount());
    }
}
//100
//Bobby  barked
//Buddy barked
//102
//102
//
//Process finished with exit code 0
