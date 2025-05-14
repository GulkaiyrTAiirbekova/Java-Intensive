package Week1;
import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner  sc = new Scanner(System.in) ;
//       String s  = sc.next();
//        int a  = sc.nextInt();  // waiting point after next
//        int b =  sc.nextInt();
//        String name = sc.next();
//
//        System.out.println("Hello" + " "+  name );
//
//        System.out.println("---------------");
//
//        System.out.println(a + b);
//    }
//}

//public class Main {
//    public static void main(String [] args){
//        Scanner sc =  new Scanner(System.in);
//        int a = sc.nextInt(),b=  sc.nextInt();
//
//        if (a==b) {
//            System.out.println("equal");
//        } else{
//            System.out.println("not equal");
//        }
//    }
//}

//public class Main {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //<,>,<=,>=
//        if ( n<0){
//            System.out.println("negative");
//        } else{
//            //Otherwise n is greater or to 0
//            if (n>0){
//                System.out.println("positive");
//            } else {
//                System.out.println("zero");
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n == 0) {
//            System.out.println("zero");
//            } else {
//                if (n > 0) {
//                    System.out.println("positive");
//                    } else {
//                            System.out.println("negative");
//            }
//        }
//    }
//}

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //a ->A
        //b -> B
        //c->C
        //Invalid Character
        String s = sc.next();
        if (s.equals( "a")){
            System.out.println("A");
        } else{
            if (s.equals ("b")){
                System.out.println("B");
            } else{
                if (s.equals ("c")){
                    System.out.println("C");
                }else {
                    System.out.println("Invalid Character");
                }
            }
        }
    }
}