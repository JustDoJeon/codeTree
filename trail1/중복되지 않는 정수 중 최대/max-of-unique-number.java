import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[100001]; // 문제의 최대값에 맞게 설정

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            cnt[x]++;
        }

        int answer = -1;

        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 1) {
                answer = Math.max(answer, i);
            }
        }

        System.out.println(answer);
    }
}