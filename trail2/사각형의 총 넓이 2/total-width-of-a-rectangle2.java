
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean[][] board = new boolean[201][201];

        int OFFSET = 100;

        for (int k = 0; k < n; k++) {

            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for(int x=x1; x<x2; x++){
                for(int y=y1; y<y2; y++){
                    board[x+OFFSET][y+OFFSET] = true;
                }
            }
        }
        

        int answer = 0;

        for (int x = 0; x < 201; x++) {
            for (int y = 0; y < 201; y++) {

                if (board[x][y]) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}