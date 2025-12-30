package Loop;

import java.util.Scanner;

//        *
//        **
//        ***
//        ****
//        ***** (printing for 5 times)
//        n=5;
public class Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows

        for (int i = 1; i <= n; i++) {
            // print i stars on the same line
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // move to the next line after each row
            sc.close();
        }
    }
}
