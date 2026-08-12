import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int num = 1;

        // 대각선 번호
        for (int diagonal = 0; diagonal <= n + m - 2; diagonal++) {

            // 대각선의 시작 행
            int row = Math.min(diagonal, n - 1);

            // 대각선의 시작 열
            int col = diagonal - row;

            // 오른쪽 위 -> 왼쪽 아래
            while (row >= 0 && col < m) {
                arr[row][col] = num++;

                row--;
                col++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}