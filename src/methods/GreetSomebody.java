package methods;

public class GreetSomebody {
    public static void greet(String name,String surname){
        System.out.println("Hello " + name + " !");
    }
    public static void main(String [] args){
        greet("Gulkaiyr", "Taiirbekova");
        greet ("Aliya", "Rysbek");
    }
}
