import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        // 첫 번째 배열
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 빈 줄 하나 건너뛰기
        br.readLine();

        // 두 번째 배열
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] * arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}