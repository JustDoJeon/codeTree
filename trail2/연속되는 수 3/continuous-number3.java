import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int prev = Integer.parseInt(br.readLine());

        int count = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {

            int num = Integer.parseInt(br.readLine());

            // 부호가 같은 경우
            if ((num > 0 && prev > 0) ||
                (num < 0 && prev < 0)) {

                count++;

            } else {
                count = 1;
            }

            max = Math.max(max, count);

            prev = num;
        }

        System.out.println(max);
    }
}