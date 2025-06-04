package informatics;

import java.util.Scanner;

public class TensDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int TensDigit = number / 10;
        System.out.println(TensDigit);

        scanner.close();
    }
}
