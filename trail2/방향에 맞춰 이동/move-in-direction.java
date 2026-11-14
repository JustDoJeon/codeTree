import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 0:N, 1:E, 2:S, 3:W
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {

            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            char d = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());

            int dir;

            if (d == 'N') {
                dir = 0;
            } else if (d == 'E') {
                dir = 1;
            } else if (d == 'S') {
                dir = 2;
            } else {
                dir = 3;
            }

            x += dx[dir] * num;
            y += dy[dir] * num;
        }

        bw.write(x + " " + y);
        bw.flush();
    }
}