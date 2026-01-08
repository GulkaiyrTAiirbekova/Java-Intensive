package Loop;

import java.util.Random;
import java.util.Scanner;

public class DoWhileGuess {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number =80;
        int guess;
        do{
            guess = sc.nextInt();
            if(number == guess){
                System.out.println("You win");
            } else{
                if(guess < number) {
                    System.out.println("less");
                } else{
                    System.out.println("greater");
                }
            }
        } while (guess != number);
        System.out.println("Finish!");
        sc.close();
    }
}
