
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
        StringTokenizer st ;

        int OFF_SET = 100;

        int n = Integer.parseInt(br.readLine());
        boolean[][] board = new boolean[201][201];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j = a; j < a+8; j++){
                for(int k = b; k < b+8; k++){
                    board[j+OFF_SET][k+OFF_SET] = true;
                }
            }
        }
        int answer =0;
        for(int i = 0; i < 201; i++){
            for (int j = 0; j < 201; j++){
                if(board[i][j]){
                    answer++;
                }
            }
        }

        System.out.println(answer);


    }
}