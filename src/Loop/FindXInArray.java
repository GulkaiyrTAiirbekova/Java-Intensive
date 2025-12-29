package Loop;

import java.util.Scanner;

public class FindXInArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i=0; i< n; ++i){
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean meet = false;
        for(int i = 0; i < n; ++i){
            if(array[i] ==x ){
                meet = true;
                break;// no need to check further
            }
        }
        if(meet){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}

