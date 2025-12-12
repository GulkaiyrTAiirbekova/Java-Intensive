package Week1;

import java.util.Scanner;

public class ScannerMethod {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //it will wait an input in terminal
        int a = sc.nextInt();

        System.out.println("Hello " + name);
        System.out.println("He/She is " + a);
    }
}
