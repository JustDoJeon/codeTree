
import java.awt.*;
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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int OFF_SET = 1000;

        int sumA = 0;
        int sumB = 0;

        boolean[][] board = new boolean[2001][2001];

        // A
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                board[i+OFF_SET][j+OFF_SET] = true;
                sumA ++;
            }
        }

        st= new StringTokenizer(br.readLine());

        //B
        int xx1 = Integer.parseInt(st.nextToken());
        int yy1 = Integer.parseInt(st.nextToken());
        int xx2 = Integer.parseInt(st.nextToken());
        int yy2 = Integer.parseInt(st.nextToken());

        for(int i = xx1; i < xx2; i++){
            for(int j = yy1; j < yy2; j++){
                board[i+OFF_SET][j+OFF_SET] = true;
                sumB ++;
            }
        }

        //M
                st= new StringTokenizer(br.readLine());

        int mX1 = Integer.parseInt(st.nextToken());
        int mY1 = Integer.parseInt(st.nextToken());
        int mX2 = Integer.parseInt(st.nextToken());
        int mY2 = Integer.parseInt(st.nextToken());

        int answer = 0;

        for(int i = mX1; i < mX2; i++){
            for(int j = mY1; j < mY2; j++){
                if(board[i+OFF_SET][j+OFF_SET]){
                    answer++;
                }
            }
        }

        System.out.println(sumA+sumB-answer);








    }
}