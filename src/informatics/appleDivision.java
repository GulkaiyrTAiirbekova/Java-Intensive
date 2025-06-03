package informatics;
import java.util.Scanner;

public class appleDivision {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int applePerStudent =N/K;

        System.out.println(applePerStudent);
        scanner.close();
    }
}

