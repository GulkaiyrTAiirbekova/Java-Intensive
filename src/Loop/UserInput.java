package Loop;

import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //5
        //1 2 3 4 5

        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; ++i){
            array[i] = sc.nextInt();
        }
        for(int i= 0; i < n; ++i){
            System.out.println(array[i]);
        }
    }
}