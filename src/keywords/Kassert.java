package keywords;
//The purpose of assertions is to clearly mark where a program is doing something unintended when debugging and testing a program.

//java -ea Kassert (-ea = enable assertions)
public class Kassert {
    public static void main(String[] args){
        //Enable assertion
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);
        // Run the assert example
        AssertExample example = new AssertExample();
        example.run();
    }
}

class AssertExample {
    public void run() {
        int a = 23;
        try {
            assert a == 23; // Assertion without a fail message
            assert a == 23 : "a is not 23";
            assert a == 15 : "a is not 15";
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}