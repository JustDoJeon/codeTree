import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNumber(n);

    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }

        // 내려갈 때 출력
        System.out.print(n + " ");

        printNumber(n - 1);

        // 다시 올라올 때 출력
        System.out.print(n + " ");
    }
}
