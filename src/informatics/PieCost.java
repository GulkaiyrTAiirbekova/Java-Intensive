package informatics;

import java.util.Scanner;

public class PieCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // рубли
        int b = scanner.nextInt(); // копейки
        int n = scanner.nextInt(); // кол-во пирожков

        int totalKopecks = (a * 100 + b) * n;

        int rubles = totalKopecks / 100;
        int kopecks = totalKopecks % 100;

        System.out.println(rubles + " " + kopecks);
    }
}
