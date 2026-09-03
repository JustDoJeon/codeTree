import java.util.Scanner;

public class Main {

    // 별을 n개 출력
    public static void printStars(int n) {
        if (n == 0) {
            return;
        }

        System.out.print("*");
        printStars(n - 1);
    }

    // 1번째 줄 ~ n번째 줄 출력
    public static void printLines(int n) {
        if (n == 0) {
            return;
        }

        printLines(n - 1);

        printStars(n);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printLines(n);
    }
}