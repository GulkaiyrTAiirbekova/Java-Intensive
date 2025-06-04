package methods;

public class Sum {
    public static int sum(int a, int b){
        System.out.println("Using int sum");
        return a+ b;
    }
    public static double sum(double a, double b){
        System.out.println("Using double sum");
        return a+ b;
    }
    public static void main(String [] args){
//        System.out.println(sum(3,7));
//        System.out.println(sum(5.2,6.6));
        double a = 2.2;
        int b= 4;
        System.out.println(sum(a,b));

    }
}
