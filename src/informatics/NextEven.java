package informatics;

import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nextEven = n + 2 - (n % 2); // important part

        System.out.println(nextEven);

        scanner.close();
    }
}
