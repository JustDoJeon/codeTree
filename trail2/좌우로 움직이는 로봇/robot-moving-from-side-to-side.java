import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] positionA = new int[2_000_005];
        int[] positionB = new int[2_000_005];

        int timeA = 0;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            for (int j = 0; j < t; j++) {

                timeA++;

                if (d == 'R') {
                    positionA[timeA] = positionA[timeA - 1] + 1;
                } else {
                    positionA[timeA] = positionA[timeA - 1] - 1;
                }
            }
        }

        int timeB = 0;

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            for (int j = 0; j < t; j++) {

                timeB++;

                if (d == 'R') {
                    positionB[timeB] = positionB[timeB - 1] + 1;
                } else {
                    positionB[timeB] = positionB[timeB - 1] - 1;
                }
            }
        }

        int maxTime = Math.max(timeA, timeB);

        // A가 먼저 끝난 경우
        for (int t = timeA + 1; t <= maxTime; t++) {
            positionA[t] = positionA[t - 1];
        }

        // B가 먼저 끝난 경우
        for (int t = timeB + 1; t <= maxTime; t++) {
            positionB[t] = positionB[t - 1];
        }

        int answer = 0;

        for (int t = 1; t <= maxTime; t++) {

            if (positionA[t - 1] != positionB[t - 1]
                    && positionA[t] == positionB[t]) {

                answer++;
            }
        }

        System.out.println(answer);
    }
}