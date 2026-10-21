
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

        boolean[][] board = new boolean[2001][2001];


        int x1 = Integer.parseInt(st.nextToken());
        int y1 =  Integer.parseInt(st.nextToken());
        int x2 =  Integer.parseInt(st.nextToken());
        int y2 =  Integer.parseInt(st.nextToken());

        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                board[i+OFF_SET][j+OFF_SET] = true;
            }
        }

        st= new StringTokenizer(br.readLine());

        int xx1 = Integer.parseInt(st.nextToken());
        int yy1 =  Integer.parseInt(st.nextToken());
        int xx2 =  Integer.parseInt(st.nextToken());
        int yy2 =  Integer.parseInt(st.nextToken());

        for(int i = xx1; i < xx2; i++){
            for(int j = yy1; j < yy2; j++){
                board[i+OFF_SET][j+OFF_SET] = false;
            }
        }

        int minX = 2001;
        int minY = 2001;
        int maxX = -1;
        int maxY = -1;

        for(int i=0; i<2001; i++){
            for(int j=0; j<2001; j++){
                if(board[i][j]){
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);

                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        if(maxX == -1){
            System.out.println(0);
            return;
        }

        int width = maxX - minX + 1;
        int height = maxY - minY + 1;

        System.out.println(width * height);







    }
}