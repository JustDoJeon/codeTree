

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] result = swap(n, m);

        n = result[0];
        m = result[1];

        System.out.println(n + " " + m);


    }

    public static int[] swap(int n, int m){

        if(n>m){
            n = n *2;
            m = m+10;
        }else{
            n = n+10;
            m= m*2;
        }

        int[] result = new int[2];
        result[0] = n;
        result[1] = m;
        return result;
    }


}

