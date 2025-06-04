package informatics;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int LastDigit = number % 10;
         System.out.println(LastDigit);
         scanner.close();

    }
}
