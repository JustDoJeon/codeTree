import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (j % 2 == 0) {
                    System.out.print(j * n + i + " ");
                } else {
                    System.out.print((j + 1) * n - 1 - i + " ");
                }

            }

            System.out.println();
        }
    }
}