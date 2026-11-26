
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        //D :  u 위 d 아래 r 오른 l 왼

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        char direction = st.nextToken().charAt(0);

        int dir;

        if (direction == 'L') {
            dir = 3;
        } else if (direction == 'R') {
            dir = 1;
        } else if (direction == 'U') {
            dir = 2;
        } else {
            dir = 0;
        }

        for(int i=0; i<T; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 1 || nx > N || ny < 1 || ny > N) {
                dir = (dir + 2) % 4;
            } else {
                x = nx;
                y = ny;
            }
        }
       

        System.out.println(x + " " + y );





    }

}
