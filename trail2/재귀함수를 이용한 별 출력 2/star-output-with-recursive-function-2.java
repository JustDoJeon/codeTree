import java.io.*;

public class Main {

    static void printStar(int n) {
        if (n == 0) {
            return;
        }

        // 내려갈 때
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        printStar(n - 1);

        // 다시 올라올 때
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        printStar(n);
    }
}