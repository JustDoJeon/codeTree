
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        int x = 0;
        int y = 0;
        int dir = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        arr[x][y] = 1;

        for (int num = 2; num <= N * M; num++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0 || ny < 0 || nx >= N || ny >= M || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;

                nx = x + dx[dir];
                ny = y + dy[dir];

            }

            x = nx;
            y = ny;

            arr[x][y] = num;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N;
             i++){
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());


    }

}
