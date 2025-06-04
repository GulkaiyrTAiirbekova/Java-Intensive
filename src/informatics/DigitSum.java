package informatics;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); // Ввод 3-значного числа

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int sum = hundreds + tens + ones;

        System.out.println(sum); // Вывод суммы

        scanner.close();
    }
}

