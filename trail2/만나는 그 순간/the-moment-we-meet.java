
import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int timeA = 0;
        int timeB = 0;
        int posA = 0;
        int posB = 0;

        int[] positionA = new int[1_000_001];
        int[] positionB = new int[1_000_001];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int aT = Integer.parseInt(st.nextToken());
            for(int j=0; j<aT; j++ ){
                timeA ++;
                if(a == 'R'){
                    posA++;
                }else{
                    posA--;
                }

                positionA[timeA] = posA;
            }
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            char b = st.nextToken().charAt(0);
            int bT = Integer.parseInt(st.nextToken());
            for(int j=0; j<bT; j++ ){
                timeB ++;
                if(b == 'R'){
                    posB++;
                }else{
                    posB--;
                }

                positionB[timeB] = posB;
            }
        }

        for(int i=1; i<=timeA; i++){
            if(positionA[i] == positionB[i]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);


    }

}
