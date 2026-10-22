import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            if (num > T) {
                count++;
            } else {
                count = 0;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}