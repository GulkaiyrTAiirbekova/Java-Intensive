package Week4;

public class MathUtils {
    private static int operationCount;

    // Static block to initialize the static counter
    static {
        operationCount = 0;
        System.out.println("MathUtils class loaded. Operation counter initialized");
    }

    /**
     * Adds two integers and increments the operation counter.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers
     */
    public static int add(int a, int b) {
        operationCount++;
        return a + b;
    }

    /**
     * Returns the total number of operations performed by this class.
     *
     * @return The current operation count
     */
    public static int getOperationCount() {
        return operationCount;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 4 and 9: " + MathUtils.add(4, 9));
        System.out.println("Current operation count: " + MathUtils.getOperationCount());

        System.out.println("Sum of 3 and 6: " + MathUtils.add(3, 6));
        System.out.println("Current operation count: " + MathUtils.getOperationCount());
    }
}

