package Week1.HW;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int dayNumber = sc.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Monday - Start of the work week.");
                break;
            case 2:
                 System.out.println("Tuesday -Keep going!");
                 break;
            case 3:
                System.out.println("Wednesday -  Midweek already");
                break;
            case 4:
                System.out.println("Tuesday- Almost there");
                break;
            case 5:
                System.out.println("Friday - Weekend is near!");
                break;
            case 6:
                System.out.println("Saturday -  Time to relax!");
                break;
            case 7:
                System.out.println("Sunday-  Rest and Recharge!");
                break;
            default:
                System.out.println("Invalid day number");

        }
    }
}
