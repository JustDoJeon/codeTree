import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        // 파스칼의 삼각형 생성
        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {

                // 첫 번째와 마지막 값은 항상 1
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                // 가운데 값
                else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {
                sb.append(arr[i][j]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}