package methods;

public class FactorialCalculator {

    // Iterative factorial method
    public int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive factorial method
    public int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * recursiveFactorial(n - 1); // Recursive step
    }

    // Test in main method
    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();

        int num = 5;

        System.out.println("Iterative factorial of " + num + ": " + fc.iterativeFactorial(num));
        System.out.println("Recursive factorial of " + num + ": " + fc.recursiveFactorial(num));
    }
}
