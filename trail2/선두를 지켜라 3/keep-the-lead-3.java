
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

        int answer = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int[] posA = new int[1_000_001];
        int[] posB = new int[1_000_001];

        int timeA = 0;
        int timeB = 0;

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            int vA = Integer.parseInt(st.nextToken());
            int tA = Integer.parseInt(st.nextToken());

            for(int j=0; j<tA; j++){
                timeA++;
                posA[timeA] = posA[timeA - 1] + vA;            }
        }

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int vB = Integer.parseInt(st.nextToken());
            int tB = Integer.parseInt(st.nextToken());

            for(int j=0; j<tB; j++){
                timeB++;
                posB[timeB] = posB[timeB - 1] + vB;            
            }
        }

        int maxTime = Math.max(timeA, timeB);
        
        int previous = 0;
        
        for(int time =1; time <=maxTime; time++){
            int current ;
            
            if(posA[time] >posB[time]){
                current =1 ;
            }else if(posA[time] < posB[time]){
                current =2 ;
            }else {
                current =3 ;
            }
            
            if(current!=previous) {
                answer++;
                previous = current;
            }
        }

        System.out.println(answer);
        




    }

}
