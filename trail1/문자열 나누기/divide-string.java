import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 문자열 전부 이어붙이기
        for (int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        // 5글자마다 줄바꿈
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));

            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}