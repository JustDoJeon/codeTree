
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // 첫 번째 배열
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 번째 배열
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 비교
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr1[i][j] == arr2[i][j]) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }
    }
}