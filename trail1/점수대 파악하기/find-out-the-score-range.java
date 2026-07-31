import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[11];

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int cnt = Integer.parseInt(st.nextToken());

            if (cnt == 0) {
                break;
            }

            int ten = cnt / 10;

            arr[ten]++;
        }

        for (int i = 10; i >= 1; i--) {
            sb.append(i*10).append(" - ").append(arr[i]).append("\n");
        }

        System.out.print(sb);
    }
}