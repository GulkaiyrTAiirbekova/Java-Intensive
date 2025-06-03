package informatics;

import java.util.Scanner;


public class NextPrevious {
    public static  void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int next = number +1;
        int prev = number-1;

        System.out.println(String.format("The next number for the number " +number + " is " +next + "."));
        System.out.println(String.format("The previous number for the number " +number + " is " + prev + "."));

        scanner.close();
    }
}
