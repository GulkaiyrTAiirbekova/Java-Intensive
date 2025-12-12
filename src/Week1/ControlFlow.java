package Week1;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String [] args){
        //for conditional statements, key word is "if"
        boolean execute = true;
        if(execute) {
            System.out.println("it works");
        }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Negative:  number, less than 0 ");
            } else {
                if(num>0){
                    System.out.println("Positive: number is greater than 0");
                } else{
                    System.out.println("Zero: number is equal to zero");
            }
        }

    }
}
