package Week4;
//modifier.= private
//define a type= name
//method = bark
//public class Dog {
//    public String name;
//    private Dog(String name){
//        baddy.name
//    }
//    public void bark(){
//        System.out.println(this.name + " barked!");
//
//    }
//
//}

//public class Dog{
//    public String name;
//
//    public void bark(){
//        System.out.println(this.name + " barked");
//    }
//}
//public class Dog{
//    public String name;
//
//    public Dog(String name){
//        this.name = name;
//    }
//    public void bark(){
//        System.out.println(this.name = " barked!");
//    }
//}
//Dog class implementation
//public class Dog {
//    private String name;
//    private String breed;

    // Constructor


//    public Dog(String name, String breed) {
//        // Initialize attributes
//        this.name = name;
//        this.breed = breed;
//    }
//    // Method to make the dog bark
//    public void bark() {
//        System.out.println(this.name + " barked");
//        System.out.println("Breed: " + this.breed);
//    }
//    public static void main(String[] args){
//        Dog myDog = new Dog("Money", "Labrador");
//        myDog.bark();
//    }
//}

//public modifier on
//private modifier
//package-private modifier
//USING "COUNT" method
//public class Dog{
//    static{
//        count=100;
//        System.out.println(getCount());
//    }
//    private String name;
//    public static int count;
//
//    public Dog(String name){
//        this.name = name;
//    }
//    public void bark(){
//        System.out.println(this.name + " barked");
//        count++;
//    }
//    public static int getCount(){
//        return count;
//    }
//}

//OOP
public class Dog extends Animal{
    public Dog(String name){
        this.name = name;
    }
    public void bark(){
        System.out.println(this.name + "barked");
    }

}