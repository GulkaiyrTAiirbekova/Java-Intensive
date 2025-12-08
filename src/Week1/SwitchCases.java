package Week1;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int WorkOutDay = sc.nextInt();

        switch (WorkOutDay){
            case 1:
                System.out.println("Monday - Start your week with morning workout");
                break;
            case 2:
                System.out.println("Tuesday - Concentrate on your Studies and prepare for tomorrow");
                break;
            case 3:
                System.out.println("Wednesday - Mid of the week, go to workout" );
                break;
            case 4:
                System.out.println("Thursday - Day to solve Leetcode solutions");
                break;
            case 5:
                System.out.println("Friday -  Last Workout day for this week");
                break;
            case 6:
                System.out.println("Saturday  - Day to have quality time with your children");
                break;
            case 7:
                System.out.println("Sunday - Day to have a quality rest and get prepared for th upcoming productive week");
                break;
            default:
                System.out.println("Invalid day Number");
        }
        System.out.println("Enjoy your day");
    }

}
