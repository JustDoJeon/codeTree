
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                // 첫 번째 행 또는 첫 번째 열
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                }

                // 나머지
                else {
                    arr[i][j] = arr[i - 1][j]
                            + arr[i][j - 1]
                            + arr[i - 1][j - 1];
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}