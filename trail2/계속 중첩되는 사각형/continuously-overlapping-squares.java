
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

        int OFF_SET = 100;



        int[][] board = new int[201][201];

        int n = Integer.parseInt(st.nextToken());

        // A
        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int x = x1; x<x2; x++){
                for(int y = y1; y<y2; y++){
                    if(i%2 ==0 ){
                        board[x+OFF_SET][y+OFF_SET] = 1;
                    }else{
                        board[x+OFF_SET][y+OFF_SET] = 2;
                    }
                }
            }
        }

        int answer = 0;
        for(int i=0; i<201; i++){
            for(int j=0; j<201; j++){
                if(board[i][j] == 2){
                    answer++;
                }
            }
        }

        System.out.println(answer);









    }
}