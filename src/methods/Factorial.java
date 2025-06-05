package methods;
//Recursion = func that calls itself
//public class Factorial {
//   // n! = 1 *2 *3 *...n
//    //factorial(n) = |factorial(n-1) * n,if n >1
//    // | 1,if n == 1
//    public static int factorial(int n){
//        if (n== 1){
//            return 1;
//        }else{
//            return factorial(n - 1) * n;
//        }
//    }
//    public static void main(String [] ars){
//        System.out.println(factorial(5));
//    }
//}
public class Factorial {
    public static int factorial(int n){
        if (n == 1){
            return 1;
        } else{
            return factorial(n-1) *n;
        }
    }
//    public static int factorialWithLoops(int n){
//        int result =1;
//        for (int i=1; i<=n; ++i);
//        result = result * i;
//    } return result;
}
