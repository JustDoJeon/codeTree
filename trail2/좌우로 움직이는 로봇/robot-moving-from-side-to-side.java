
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
        final int OFF_SET = 100001;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] positionA = new int[OFF_SET];
        int[] positionB = new int[OFF_SET];
        int timeA = 0;
        int curA = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int posA = Integer.parseInt(st.nextToken());
            char directionA = st.nextToken().charAt(0);
            for (int j = 0; j < posA; j++) {
                timeA++;
                if (directionA == 'R') {
                    curA++;
                }else{
                    curA--;
                }

                positionA[timeA] = curA;
            }
        }

        int timeB = 0;
        int curB = 0;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int posB = Integer.parseInt(st.nextToken());
            char directionB = st.nextToken().charAt(0);
            for (int j = 0; j < posB; j++) {
                timeB++;
                if (directionB == 'R') {
                    curB++;
                }else{
                    curB--;
                }

                positionB[timeB] = curB;
            }
        }

        int maxTime = Math.max(timeA,timeB);

        for(int t = timeA+1; t<=maxTime; t++){
            positionA[t]  = positionA[timeA];
        }

        for(int t = timeB+1; t<=maxTime; t++){
            positionB[t]  = positionA[timeB];

        }
        int answer = 0;

        for(int t = 1; t<=maxTime; t++){
            if(positionA[t] == positionB[t]
            && positionA[t-1] != positionB[t-1]){
                answer++;
            }
        }


        System.out.println(answer);





    }

}
