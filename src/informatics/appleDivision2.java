package informatics;

import java.util.Scanner;

import java.util.Scanner;

public class appleDivision2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int remainder = K % N;

        System.out.println(remainder);
        scanner.close();
    }
}

