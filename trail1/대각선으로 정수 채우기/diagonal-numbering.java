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

            // 대각선 시작 위치
            int row;
            int col;

            if (diagonal < m) {
                row = 0;
                col = diagonal;
            } else {
                row = diagonal - m + 1;
                col = m - 1;
            }

            // 위 -> 아래, 오른쪽 -> 왼쪽
            while (row < n && col >= 0) {
                arr[row][col] = num++;

                row++;
                col--;
            }
        }

        // 출력
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