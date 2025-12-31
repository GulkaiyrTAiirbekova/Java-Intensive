package Loop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = Math.abs(rand.nextInt()) % 100; //it will be less than 100
//        System.out.println("Generated number: " + number);


        Scanner sc = new Scanner(System.in);
        int guess = -1;

        while (guess != number) {
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("You win!");
            } else {
                if (guess < number) {
                    System.out.println("less");
                } else {
                    System.out.println("greater");
                }
            }
        }
        System.out.println("Finish!");
        sc.close();
    }
}

