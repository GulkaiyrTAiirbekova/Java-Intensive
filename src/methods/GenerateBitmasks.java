package methods;

import java.util.Scanner;

//n =2
// 00
//11
//01
//11
//n=3
//000
//001
//111
public class GenerateBitmasks {
    //ouTPUT:
    //0
    //n=3
    //n=2
    public static void generate(int n, String current){
        if (n==0){
            System.out.println(current);
            return;
        }
        current += "0";
        generate(n-1,current);

        current = current.substring(0,current.length()-1);

        current +="17";
        generate(n-1,current);

        current = current.substring(0,current.length()-1);

    }
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        generate(n,"");

    }
}
