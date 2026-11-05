
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

        int[] posA= new int[1000001];
        int[] posB= new int[1000001];

        int timeA = 0;
        int positionA =0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for(int j=0; j<t; j++){
                timeA++;
                positionA+=v;
                posA[timeA] = positionA;
            }
        }

        int timeB = 0;
        int positionB =0;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for(int j=0; j<t; j++){
                timeB++;
                positionB+=v;
                posB[timeB] = positionB;
            }
        }

        int leader = 0;
        int answer = 0;

        for(int time =1; time<=timeA; time++){
            if(posA[time] > posB[time]){
                if(leader == 2 ){
                    answer++;
                }
                leader = 1;
            }else if(posA[time]<posB[time]){
                if(leader == 1 ){
                    answer++;
                }
                leader = 2;
            }
        }

        System.out.println(answer);


    }

}
