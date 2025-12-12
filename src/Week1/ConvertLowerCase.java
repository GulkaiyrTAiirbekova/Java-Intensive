package Week1;

import java.util.Scanner;

public class ConvertLowerCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //a-A
        //b-B
        String letter = sc.next();
        if (letter.equals("a")){
            System.out.println("Converter to " + "A");
        }else{
            if (letter.equals("b")){
                System.out.println("Converted to B");
            }else{
                System.out.println("Only letters 'a', 'b' are expected in this logic");
            }
        }
    }
}
