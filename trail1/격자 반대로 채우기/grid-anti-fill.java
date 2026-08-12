import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        int num = 1;

        for (int col = n - 1; col >= 0; col--) {

            if ((n - 1 - col) % 2 == 0) {
                // 아래 → 위
                for (int row = n - 1; row >= 0; row--) {
                    arr[row][col] = num++;
                }
            } else {
                // 위 → 아래
                for (int row = 0; row < n; row++) {
                    arr[row][col] = num++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                sb.append(arr[row][col]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}