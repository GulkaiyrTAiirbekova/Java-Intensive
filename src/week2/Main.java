package week2;

import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main (String [] args){
        Random rand = new Random();
        int number = Math.abs(rand.nextInt()) %100;
        //System.out.println(rand.nextInt());
        System.out.println(number);
        Scanner sc = new Scanner (System.in);
//        int guess = sc.nextInt();
        int guess = -1;
        while (guess != number){
            if(number == guess){
                System.out.println("You win!");
            } else{
                if(guess < number){
                    System.out.println(" less");
                } else {
                    System.out.println("greater");
                }
            }
        }
        System.out.println("Finish");
    }
}