


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n  = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int sum =0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            // Please write your code here.
            for(int j= a1-1; j<a2; j++){
                sum+=arr[j];
            }

            System.out.println(sum);


            sum =0;
        }





    }

}

