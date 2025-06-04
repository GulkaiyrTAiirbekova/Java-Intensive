package informatics;
import java.util.Scanner;

public class DecimalTens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();        // ввод числа

        int tens = (number / 10) % 10;         // получаем десятки

        System.out.println(tens);              // выводим результат

        scanner.close();
    }
}
