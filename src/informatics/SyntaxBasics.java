package informatics;

import java.util.Scanner;

public class SyntaxBasics {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        double c = Math.sqrt( a * a + b* b);

        System.out.println(c);
        scanner.close();

    }
}