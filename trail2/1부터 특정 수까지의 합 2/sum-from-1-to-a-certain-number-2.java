import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int result = recursiveSum(n);
        System.out.println(result);
    }

      public static int recursiveSum(int n) {
        // 종료 조건 (Base case): n이 1 이하이면 n을 반환
        if (n <= 1) {
            return n;
        }
        // 재귀 호출 (Recursive step): n + (1부터 n-1까지의 합)
        return n + recursiveSum(n - 1);
    }
}